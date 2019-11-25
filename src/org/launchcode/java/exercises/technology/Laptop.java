package org.launchcode.java.exercises.technology;

public class Laptop extends Computer {
    private int powerAdapterWatts;
    private boolean webCam;

    // Constructors

    public Laptop(String operatingSystem, String processor, int ramGb, int storageGb, int powerAdapterWatts, boolean webcam) {
        super(operatingSystem, processor, ramGb, storageGb);
        this.powerAdapterWatts = powerAdapterWatts;
        this.webCam = webcam;
    }

    // Custom methods

    public void addExternalWebCam() { this.webCam = true; }

    // Getters and Setters

    public int getPowerAdapterWatts() { return powerAdapterWatts; }

    public void setPowerAdapterWatts(int powerAdapterWatts) { this.powerAdapterWatts = powerAdapterWatts; }

    public boolean isWebCam() { return webCam; }

    public void setWebCam(boolean webCam) { this.webCam = webCam; }
}
