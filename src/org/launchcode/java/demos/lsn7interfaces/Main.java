package org.launchcode.java.demos.lsn7interfaces;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
//        Comparator comparator = new FlavorComparator();
//        flavors.sort(comparator);
        flavors.sort(new FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        cones.sort(new ConeComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting, also Bonus #1
        System.out.println("Sorted Flavors (by number of allergens):\n");
        for (Flavor flavor : flavors) {
            System.out.print(flavor.getName() + ": ");
            for (String allergen : flavor.getAllergens()) {
                if (flavor.getAllergens().size() - 1 > flavor.getAllergens().indexOf(allergen)) {
                    System.out.print(allergen + ", ");
                } else {
                    System.out.print(allergen);
                }
            }
            System.out.print("\n");
        }

        System.out.println("\nSorted Cones (by cost):\n");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": " + formatter.format(cone.getCost()));
        }

        // TODO: Bonus #2
        toppings.sort(new ToppingComparator());
        System.out.println("\nSorted Toppings (by name):\n");
        for (Topping topping : toppings) {
            System.out.println(topping.getName());
        }
    }
}