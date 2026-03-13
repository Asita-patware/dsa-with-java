package OOPS.Inheritance;

public class A1_SingleInheritance {
    public static void main(String[] args) {
        
        Fish shark = new Fish();
        shark.eat();      // inherited method
        shark.breathe();  // inherited method
        shark.swim();     // own method

    }
}

// Parent Class
class Animal {
    String color;
    
    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}


// Child Class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims");
    }
}



