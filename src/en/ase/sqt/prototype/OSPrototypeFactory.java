package en.ase.sqt.prototype;

import java.util.HashMap;
import java.util.Map;

public class OSPrototypeFactory {
    private static final Map<OSEdition, OS> registry = new HashMap<>();

    static {
        try {
            registry.put(OSEdition.V1, new OS(1));
            registry.put(OSEdition.V2, new OS(2));
            registry.put(OSEdition.V3, new OS(3));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static OS getClone(OSEdition edition) throws CloneNotSupportedException {
        return registry.get(edition).clone();
    }
}