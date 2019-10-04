package com.generalassembly;

import com.generalassembly.Animal;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Elephant", 4, 25f, false);
        System.out.println(animal.getFact());
        animal.setName("Lion");
        animal.setTopSpeed(50f);
        System.out.println(animal.getFact());
	    
    }
}
