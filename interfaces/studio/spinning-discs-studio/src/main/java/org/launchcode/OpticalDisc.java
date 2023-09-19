package org.launchcode;

public interface OpticalDisc {
    int maxRPM = 5000;
    void spinDisc();
    String readDisc();
    void writeDisc();
    void reportData();

}
