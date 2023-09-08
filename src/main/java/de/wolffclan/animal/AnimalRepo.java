package de.wolffclan.animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalRepo {
    List<Animal> animals;

    public AnimalRepo() {
        animals = new ArrayList<>();
        animals.add(new Animal(1,"Leo"));
    }
}
