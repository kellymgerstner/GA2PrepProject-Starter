package org.supportservices;

import java.util.Objects;

public class Service {
    //fields
    private int id;
    private static int nextId = 1;
    private String name;
    private Provider provider;
    private Category category;
    private Location location;

    //Constructors
    public Service(){
        this.id = nextId;
        nextId++;
    }

    public Service(String name, Provider provider, Category category, Location location){
        this();
        this.name = name;
        this.provider = provider;
        this.category = category;
        this.location = location;
    }

    //TODO: Add necessary getters and setters

    //TODO: Override Equals and HashCode methods

    //TODO: Use TDD to build toString method


}


