package com.example.quizapp;

public class Category {
    public static final int PROGRAMMING = 1;
    public static final int GEOGRAPHY = 1;
    public static final int MATHS = 1;


    public int id;
    public String name;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return getName();
    }
}
