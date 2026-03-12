public class A2_Constructors {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student("Asita");
        System.out.println(s2.name);
        Student s3 = new Student("Asita" , 123);
        System.out.println(s3.name + " , " + s3.roll);

    }
}

class Student {
    String name;
    int roll;


    // Non - Parameterized Constructor
    Student() {
        System.out.println("Non - Parameterized constructor called");
    }


    // Parameterized Constructor
    Student(String name) {
        this.name = name;
        System.out.println("Parameterized constructor called");
    }

    // Parameterized Constructor
    Student(String name,int roll) {
        this.name = name;
        this.roll = roll;
        System.out.println("Parameterized constructor called");
    }

}