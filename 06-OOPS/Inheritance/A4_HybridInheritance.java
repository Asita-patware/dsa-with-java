package OOPS.Inheritance;

public class A4_HybridInheritance {

    public static void main(String[] args) {

        Puppy puppy = new Puppy();

        puppy.eat();   // from Animal
        puppy.bark();  // from Dog
        puppy.weep();  // from Puppy
    }
}

// Parent Class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// Child 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Child of Dog (Multilevel part)
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// Another child of Animal (Hierarchical part)
class Fish extends Animal {
    void swim() {
        System.out.println("Fish swims");
    }
}