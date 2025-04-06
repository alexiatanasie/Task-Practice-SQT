package en.ase.sqt.factory;

import en.ase.sqt.phone.AFeature;
import en.ase.sqt.phone.Phone;

public abstract class PhoneFactory {
    public abstract Phone createPhone(String identifier, String version, AFeature... features);
}