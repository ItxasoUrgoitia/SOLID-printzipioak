package OCP;

public class AppleAuth implements iAuthProvider {
	public boolean signIn(String log, String pass) {
        // Apple API erabiltzen
        return true;
    }
    public String getServiceName() { return "apple"; }
}
