package en.ase.sqt.phone;

import java.util.Collections;
import java.util.List;

public class Phone {
    private final String identifier;
    private final String version;
    private final List<AFeature> features;

    public Phone(String identifier, String version, List<AFeature> features) {
        this.identifier = identifier;
        this.version = version;
        this.features = Collections.unmodifiableList(features);
    }

    public void printConfiguration() {
        System.out.println("Phone ID: " + identifier);
        System.out.println("Version: " + version);
        if (features.isEmpty()) {
            System.out.println("No optional features");
        } else {
            System.out.println("Features:");
            for (AFeature feature : features) {
                System.out.println(feature.getName() + " " + feature.getPrice());
            }
        }
    }


}