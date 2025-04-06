package en.ase.sqt.factory;

public class PhoneFactoryProvider {
    public static PhoneFactory getFactory(PhoneType type) {
        switch (type) {
            case BASIC:
                return new BasicPhoneFactory();
            default:
                throw new UnsupportedOperationException();
        }
    }
}