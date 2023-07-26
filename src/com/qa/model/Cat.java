package com.qa.model;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Hello, my name is" + getName();
    }

    @Override
    public String move() {
        return "alright, alright";
    }

    @Override
    public String toString() {
        return "Cat: " + super.toString();
    }
}
