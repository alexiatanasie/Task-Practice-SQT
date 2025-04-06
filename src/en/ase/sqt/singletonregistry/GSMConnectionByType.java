package en.ase.sqt.singletonregistry;


import en.ase.sqt.singleton.IGSMConnection;

import java.util.HashMap;
import java.util.Map;

public class GSMConnectionByType implements IGSMConnection {
    private static final Map<ConnectionType, GSMConnectionByType> connections = new HashMap<>();
    private final ConnectionType type;

    private GSMConnectionByType(ConnectionType type) {
        this.type = type;
        System.out.println("Established GSMConnection of type: " + type);
    }

    public static synchronized GSMConnectionByType getInstance(ConnectionType type) {
        GSMConnectionByType instance = connections.get(type);
        if (instance == null) {
            instance = new GSMConnectionByType(type);
            connections.put(type, instance);
        }
        return instance;
    }

    @Override
    public void call() {
        System.out.println("Calling through GSM " + type);
    }
}
