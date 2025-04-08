package en.ase.sqt.prototype;

public class OS implements Cloneable {
    private final int version;

    public OS(int version) throws InterruptedException {
        this.version = version;
        System.out.println("Building OS v" + version);
        Thread.sleep(3000);
        System.out.println("Finished making the OS.");
    }

    public void showInfo() {
        System.out.println("OS version: " + version);
    }

    @Override
    public OS clone() throws CloneNotSupportedException {
        return (OS) super.clone();
    }
}