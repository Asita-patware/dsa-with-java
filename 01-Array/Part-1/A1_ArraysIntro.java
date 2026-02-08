import java.util.Scanner;
public class A1_ArraysIntro {
  

    // Arrays as Function Arguments (by reference)
    // Increment each element of array by 1
    public static void update(int marks1[]){
        for(int i = 0; i < marks1.length; i++){
            marks1[i] += 1;
        }
    }


    public static void main(String[] args) {


        // Arrays - Creation 
        int marks[] = new int[3];   // create an array of size 3

        Scanner sc = new Scanner(System.in);
        
        // Arrays - Input 
        System.out.println("Enter marks for 3 subjects: ");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();


        // Arrays - Output
        System.out.println("Phy: " + marks[0]);
        System.out.println("Chem: " + marks[1]);
        System.out.println("Math: " + marks[2]);


        // Arrays - Update
        marks[2] += 1;  
        System.out.println("Updated Math Marks: " + marks[2]);


        // Arrays as Function Arguments
        int marks1[] = {97, 98, 99};
        update(marks1);   // passing array to function

        System.out.print("Updated marks1 array: ");
        for(int i = 0; i < marks1.length; i++){
            System.out.print(marks1[i] + " ");
        } 
        System.out.println();


        // --- Space & Time Complexity ---
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.print("Array elements: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        /*
         Space Complexity: O(n) because array size depends on n

         Time Complexity: Loop runs n times → O(n)
        */
       sc.close();
    }
}
 