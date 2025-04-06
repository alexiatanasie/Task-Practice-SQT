package en.ase.sqt.singleton;
public class GSMConnection implements IGSMConnection {
    private static GSMConnection instance;

    private GSMConnection() {
        System.out.println("GSMConnection established.");
    }

    public static synchronized GSMConnection getInstance() {
        if (instance == null) {
            instance = new GSMConnection();
        }
        return instance;
    }

    @Override
    public void call() {
        System.out.println("Calling through the shared GSMConnection...");
    }
}