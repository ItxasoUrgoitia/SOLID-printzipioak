package OCP;

public class FacebookAuth implements iAuthProvider {
	 public boolean signIn(String log, String pass) {
	        // Facebook API erabiltzen
	        return true;
	    }
	    public String getServiceName() { return "facebook"; }
}
