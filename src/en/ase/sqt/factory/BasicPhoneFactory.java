package en.ase.sqt.factory;

import en.ase.sqt.phone.AFeature;
import en.ase.sqt.phone.Phone;

import java.util.Arrays;
import java.util.List;

public class BasicPhoneFactory extends PhoneFactory {

    @Override
    public Phone createPhone(String identifier, String version, AFeature... features) {
        List<AFeature> featureList = Arrays.asList(features);
        return new Phone(identifier, version, featureList);
    }
}