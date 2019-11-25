package org.launchcode.java.exercises.technology;

public abstract class AbstractEntity {

    private int id;
    private static int nextId = 1;

    // Constructors

    public AbstractEntity() {
        this.id = nextId;
        nextId++;
    }

    // Getter

    public int getId() { return this.id; }
}
