package com.qa;
import com.qa.model.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Whiskers", 10);
        Cat c2 = new Cat("Midas", 8);
        Dog d = new Dog("Spot", 2);
        Rabbit r = new Rabbit("Peter", 2);
        Rabbit r2 = new Rabbit("Cottontail", 3);

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(c);
        animals.add(c2);
        animals.add(d);
        animals.add(r);
        animals.add(r2);

        //for (int i = 0; i < animals.size(); i++)
            //System.out.println(animals.get(i).move());

        HashMap<String, Animal> animalsMap = new HashMap<String, Animal>();

        animalsMap.put(c.getName(), c);
        animalsMap.put(c2.getName(), c2);
        animalsMap.put(d.getName(), d);
        animalsMap.put(r.getName(), r);
        animalsMap.put(r2.getName(), r2);

        for (String key : animalsMap.keySet()) {
            //System.out.println("Key: " + key + " Value: " +
                    //animalsMap.get(key));
        }

        HashSet<Animal> set = new HashSet<>();
        set.addAll(animals);

        set.add(c);
        set.add(c);

        Iterator<Animal> iter = set.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
