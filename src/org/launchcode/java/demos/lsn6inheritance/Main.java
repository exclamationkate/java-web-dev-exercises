package org.launchcode.java.demos.lsn6inheritance;

public class Main {

    public static void main(String[] args) {

        HouseCat garfield = new HouseCat("Garfield", 12);
        HouseCat spike = new HouseCat("Spike");
//        Cat plainCat = new Cat(8.6); // Can't create this object after changing Cat to an abstract CLass
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        garfield.eat();
        System.out.println(garfield.isTired());
        System.out.println(spike.getWeight());

//        System.out.println(plainCat.noise());
        System.out.println(cheshireCat.noise());

    }

}
