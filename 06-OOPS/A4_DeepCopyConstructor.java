package OOPS;

public class A4_DeepCopyConstructor {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Asita";
        s1.roll = 108;

        s1.marks[0] = 95;
        s1.marks[1] = 98;
        s1.marks[2] = 99;

        Student s2 = new Student(s1);

        // change original object
        s1.marks[0] = 50;

        System.out.println("Marks of s2 after modifying s1:");

        for(int i = 0; i < 3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {

    String name;
    int roll;
    int marks[];

    // Default constructor
    Student(){
        marks = new int[3];
    }

    // Deep Copy Constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;

        this.marks = new int[s1.marks.length];

        for(int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
}