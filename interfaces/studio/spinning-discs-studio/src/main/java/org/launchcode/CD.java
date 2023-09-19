package org.launchcode;

public class CD extends BaseDisc {
    // TODO: Implement your custom interface.
private int tracks;
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public CD(String name, Double storageCapacity, String discType, int spinSpeed, int tracks) {
        super(name, storageCapacity, discType, spinSpeed);
        this.tracks = tracks;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }
    @Override
   public void spinDisc(){
        System.out.println("A CD spins at "+getSpinSpeed() +"\n");
    }
    @Override
   public String readDisc(){
        return "Reading CD...\n";
    }
    @Override
   public void writeDisc(){
        System.out.println("Writing to CD...\n");
    }
    @Override
   public void reportData(){
        System.out.println("name:"+getName());
        System.out.println("StorageCapacity:"+getStorageCapacity());
        System.out.println("Disc type:"+getDiscType());
        System.out.println("spin speed:"+getSpinSpeed());
        System.out.println("Number of Tracks: " + getTracks()+"\n");
    }
}
