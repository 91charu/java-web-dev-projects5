package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD("CD Title", 700.0, "CD", 200, 12);
        DVD myDvd = new DVD("DVD Title", 4700.0, "DVD", 1500, 120);
        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCd.spinDisc();
        myCd.reportData();
        System.out.println("Number of Tracks: " + myCd.getTracks());
        myDvd.spinDisc();
        myDvd.reportData();
        System.out.println("Duration: " + myDvd.getDuration() + " minutes");
    }
}