package OOPS;

public class A1_OOPSBasic {
    public static void main(String[] args) {

       Pen p1 = new Pen(); // create Pen object

       p1.setColor("Blue"); 
       System.out.println(p1.getColor()); 

       p1.setTip(5); 
       System.out.println(p1.getTip()); 

       p1.setColor("Yellow"); 
       System.out.println(p1.getColor()); 


       BankAccount myAcc = new BankAccount(); 
       myAcc.username = "Asita Patware"; 
       // myAcc.password = "ansfa"; // not allowed because password is private
       myAcc.setPassword("abcsfa"); 

    }
}


class Pen {

    // properties
    private String color;
    private int tip;


    // setter method
    public void setColor(String newColor){
        color = newColor;
    }

    public void setTip(int newTip){
        tip = newTip;
    } 

    // getter method
    public String getColor(){
        return this.color;
    }

    public int getTip(){
        return this.tip;
    }
}

class Student {

    // properties
    String name;
    int age;
    float percentage;

    // method to calculate percentage
    public void calcPercentage(int phy, int math, int chem){
        percentage = (phy + chem + math) / 3.0f;
    }
} 


class BankAccount {

    public String username;

    // private property (data hiding)
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}

