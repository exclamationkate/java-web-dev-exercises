package org.launchcode.java.exercises.technology;

import java.util.ArrayList;

public class SmartPhone extends Computer {
    private boolean waterproof;
    private ArrayList<String> apps;

    // Constructors

    public SmartPhone(String operatingSystem, String processor, int ramGb, int storageGb, boolean waterproof) {
        super(operatingSystem, processor, ramGb, storageGb);
        this.waterproof = waterproof;
    }

    // Custom methods

    public void installApp(String appName) {
        this.apps.add(appName);
    }

    // Getters and Setters

    public boolean isWaterproof() { return waterproof; }

    public void setWaterproof(boolean waterproof) { this.waterproof = waterproof; }

    public ArrayList<String> getApps() { return apps; }

    public void setApps(ArrayList<String> apps) { this.apps = apps; }
}
