package org.launchcode;

public class DVD extends BaseDisc {
    // TODO: Implement your custom interface.
private int duration;
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public DVD(String name, Double storageCapacity, String discType, int spinSpeed, int duration) {
        super(name, storageCapacity, discType, spinSpeed);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDurarion(int duration) {
        this.duration = duration;
    }
    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at "+getSpinSpeed()+"\n");
    /*for(int i=maxSpinSpeed;i>2000;i++){ maxSpinSpeed:1000;
        System.out.println("i am working properly");
    }*/
    }

    @Override
    public String readDisc() {
        return "Reading DVD...\n";
    }

    @Override
    public void writeDisc() {
        System.out.println("Writing to DVD...\n");
    }

    @Override
    public void reportData() {
        System.out.println("DVD Information:");
        System.out.println("Name: " + getName());
        System.out.println("Storage Capacity: " + getStorageCapacity());
        System.out.println("Disc Type: " + getDiscType());
        System.out.println("Spin Speed: " + getSpinSpeed() + " rpm");
        System.out.println("Duration: " + getDuration() + " minutes\n");
    }
}
