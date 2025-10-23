
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class AuthService {
	private Map<String, iAuthProvider> providers = new HashMap<>();

    public AuthService(List<iAuthProvider> providerList) {
        for (iAuthProvider p : providerList) {
            providers.put(p.getServiceName(), p);
        }
    }

    public boolean signIn(String service, String log, String pass) {
        iAuthProvider provider = providers.get(service);
        if (provider != null) {
            return provider.signIn(log, pass);
        }
        return false;
    }
		
}
