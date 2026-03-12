public class A3_ShallowCopyConstructor {
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

    // Shallow Copy Constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks; // same array reference
    }
}