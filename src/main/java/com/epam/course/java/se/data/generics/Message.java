package com.epam.course.java.se.data.generics;

public class Message<IdType, NameType> {
    private final IdType id;

    private NameType name;

    public Message(IdType id, NameType name) {
        this.id = id;
        this.name = name;
    }

    public IdType getId() {
        return id;
    }

    public NameType getName() {
        return name;
    }

    public void setName(NameType name) {
        this.name = name;
    }

    public String getNameClassName() {
        if (name == null) {
            return null;
        } else {
            return name.getClass().getSimpleName();
        }
    }
}
