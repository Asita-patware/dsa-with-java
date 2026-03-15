package OOPS.Inheritance;

public class A3_HierarchicalInheritance {
     
    public static void main(String[] args) {
       
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Fish fish = new Fish();
        fish.eat();
        fish.swim();

        Bird bird = new Bird();
        bird.eat();
        bird.fly();
    }
}
    

// Parent Class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }

    void breathe() {
        System.out.println("Animal breathes");
    }
}

// Child Class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Child Class 2
class Fish extends Animal {
    void swim() {
        System.out.println("Fish swims");
    }
}

// Child Class 3
class Bird extends Animal {
    void fly() {
        System.out.println("Bird flies");
    }
}