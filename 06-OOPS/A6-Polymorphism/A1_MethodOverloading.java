package OOPS.Inheritance.Polymorphism;

public class A1_MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(5,6));
        System.out.println(calc.sum((float)5.5,(float)6.5));
        System.out.println(calc.sum(5,6,4));

    }
}

class Calculator {
    // method overloading: same method name, different parameters
    int sum(int a, int b) {
        return a+b;
    }

    float sum(float a, float b) {
        return a+b;
    }

    int sum(int a, int b, int c) {
        return a+b+c;
    }
}
