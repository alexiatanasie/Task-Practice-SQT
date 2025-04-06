package en.ase.sqt.main;

import en.ase.sqt.factory.PhoneFactoryProvider;
import en.ase.sqt.factory.PhoneType;
import en.ase.sqt.phone.Antenna;
import en.ase.sqt.phone.Battery;
import en.ase.sqt.phone.Phone;
import en.ase.sqt.singleton.IGSMConnection;
import en.ase.sqt.singletonregistry.ConnectionType;
import en.ase.sqt.singletonregistry.GSMConnectionByType;

import en.ase.sqt.singleton.GSMConnection;

public class Main {
    public static void main(String[] args) {
        // Requirement 1
        // We used the Factory pattern
        Phone phone1 = PhoneFactoryProvider.getFactory(PhoneType.BASIC).createPhone("1", "versiunea 1", new Battery(), new Antenna());
        phone1.printConfiguration();

        // Requirement 2
        // We used the Singleton pattern
        IGSMConnection shared = GSMConnection.getInstance();
        shared.call();

        IGSMConnection shared2 = GSMConnection.getInstance();
        shared2.call();

        System.out.println("shared == shared2: " + (shared == shared2));

        // Requirement 3
        // We used the Singleton Registry pattern
        IGSMConnection urgent = GSMConnectionByType.getInstance(ConnectionType.URGENT);
        IGSMConnection urgent2 = GSMConnectionByType.getInstance(ConnectionType.URGENT);
        IGSMConnection priority = GSMConnectionByType.getInstance(ConnectionType.PRIORITY);

        urgent.call();
        urgent2.call();
        priority.call();

        System.out.println("urgent == urgent2: " + (urgent == urgent2));
        System.out.println("urgent == priority: " + (urgent == priority));


    }
}