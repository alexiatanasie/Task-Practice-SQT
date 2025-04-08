package en.ase.sqt.builder;

import en.ase.sqt.factory.BasicPhoneFactory;
import en.ase.sqt.phone.AFeature;
import en.ase.sqt.phone.Phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneBuilder {
    private final String identifier;
    private final String version;
    private final List<AFeature> features = new ArrayList<>();

    public PhoneBuilder(String identifier, String version) {
        this.identifier = identifier;
        this.version = version;
    }

    public PhoneBuilder addFeature(AFeature feature) {
        this.features.add(feature);
        return this;
    }

    public Phone build() {
        return new BasicPhoneFactory().createPhone(identifier, version, features.toArray(new AFeature[0]));
    }
}