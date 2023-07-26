package com.qa.model;

public class Rabbit extends Animal {
    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Hello, my name is" + getName();
    }

    @Override
    public String move() {
        return "alright, don t yell at me";
    }

    @Override
    public String toString() {
        return "Cat: " + super.toString();
    }
}
