package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor o1, Flavor o2) {
//        return o1.getName().compareTo(o2.getName()); // Sort by name, alphabetically.
        return Integer.compare(o2.getAllergens().size(), o1.getAllergens().size()); // Sort by number of allergens, highest to lowest.
    }
}
