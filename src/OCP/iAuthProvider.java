package OCP;

public interface iAuthProvider {
	boolean signIn(String log, String pass);
    String getServiceName();
}
