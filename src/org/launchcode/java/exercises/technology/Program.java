package org.launchcode.java.exercises.technology;

public class Program {

    public static void main(String[] args) {

        Laptop macBookPro = new Laptop("macOS Catalina", "1.4 GHz Quad-Core Intel Core i5", 8, 128, 96, true);
        SmartPhone iPhone6SPlus = new SmartPhone("iOS 13.2.3", "A8", 2, 128, false);

        System.out.println("My Laptop:\nID: " + macBookPro.getId() + "\nOS: " + macBookPro.getOperatingSystem() + "\n");
        System.out.println("My Phone:\nID: " + iPhone6SPlus.getId() + "\nOS: " + iPhone6SPlus.getOperatingSystem());
    }
}
