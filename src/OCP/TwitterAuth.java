package OCP;

public class TwitterAuth implements iAuthProvider {
	public boolean signIn(String log, String pass) {
        // Twitter API erabiltzen
        return true;
    }
    public String getServiceName() { return "twitter"; }
}
