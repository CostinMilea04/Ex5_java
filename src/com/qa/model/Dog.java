package com.qa.model;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Hello, my name is" + getName();
    }

    @Override
    public String move() {
        return "alright, I gotta go";
    }

    @Override
    public String toString() {
        return "Cat: " + super.toString();
    }
}
