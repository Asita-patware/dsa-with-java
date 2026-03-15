package OOPS.Inheritance;

public class A2_MultilevelInheritance {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();      // from Animal
        dog.breathe();  // from Animal
        dog.walk();     // from Mammal
        dog.bark();     // from Dog
    }
}

// Level 1 (Parent)
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }

    void breathe() {
        System.out.println("Animal breathes");
    }
}

// Level 2 (Child of Animal)
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks");
    }
}

// Level 3 (Child of Mammal)
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}