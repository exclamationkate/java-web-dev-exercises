package org.launchcode.java.exercises.technology;

public class Computer extends AbstractEntity {
    private String operatingSystem;
    private String processor;
    private int ramGb;
    private int storageGb;

    // Constructors

    public Computer(String operatingSystem, String processor, int ramGb, int storageGb) {
        super();
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.ramGb = ramGb;
        this.storageGb = storageGb;
    }

    // Custom methods

    public void addStorage(int addedStorage) { this.storageGb += addedStorage; }

    public void downloadRam(int addedRam) { this.ramGb += addedRam; }

    // Getters and Setters

    public String getOperatingSystem() { return operatingSystem; }

    public void setOperatingSystem(String operatingSystem) { this.operatingSystem = operatingSystem; }

    public String getProcessor() { return processor; }

    public void setProcessor(String processor) { this.processor = processor; }

    public int getRamGb() { return ramGb; }

    public void setRamGb(int ramGb) {this.ramGb = ramGb; }

    public int getStorageGb() { return storageGb; }

    public void setStorageGb(int storageGb) { this.storageGb = storageGb; }
}
