package com.gamingroom;

/**
 * A class for Entity
 *
 * @author Travis Barbur
 */

// New class called Entity
public class Entity {

    // Attributes: id and name
    private long id;
    private String name;

    // Private constructor
    private Entity() {
    }

    // Public constructor that holds an identifier and a name
    public Entity(long id, String name) {
        this(); // Call default constructor
        this.id = id;
        this.name = name;
    }
    // Public method that returns the identifier
    public long getId() {
        return id;
    }
    // Public method that returns the identifier
    public String getName() {
        return name;
    }
    // Public String
    public String toString() {
        return "Entity [id=" + id + ", name=" + name + "]";
    }
}
