import java.util.Scanner;
class Calculator{
    public int add(int num1,int num2) { // declaring "int" specifies what our clas will return
        int r = num1 + num2;
        // System.out.println("in add");
        return r;
    }
}

class Computer{
    public void playmusic(){
        System.out.println("Music Plays");
        // does not return anything as we used the 
    }
    public String getPen(int cost){
        if (cost<=10) {
            return "Give me the Pen!";
        }
        else {
            return "Too expensive!";
        }
    }
    // shows method overloading -- 
    public int add(int num1,int num2,int num3) {
        return num1+num2+num3;
    }
    public int add(int num1,int num2) {
        return num1+num2;
    }
}
public class Demo_Class {
    public static void main(String[] args) {
        // int n1 = 4;
        // int n2 = 5;
        // Calculator calc = new Calculator();
        // System.out.println(calc.add(n1, n2));
        Computer com = new Computer();
        // com.playmusic();
        // System.out.println(com.playmusic()); // throws error as void type cannot return anything
        Scanner sc = new Scanner(System.in);
        // int cost = sc.nextInt();
        // System.out.println(com.getPen(cost));
        // sc.close();
        
        // Method overloading in java
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.err.println(com.add(n1, n2));
        System.err.println(com.add(n1, n2, n3));
        sc.close();
    }
}