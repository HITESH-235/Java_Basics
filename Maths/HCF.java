package Maths;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        System.out.println(solve_HCF(num1, num2));
        sc.close();
    }
    public static Integer solve_HCF(int num1, int num2) {

        if (num1 < num2) { // swapping if so
            num1 = num1^num2;
            num2 = num1^num2;
            num1 = num1^num2;
        }
        
        int temp;
        while (num2 != 0) {
            temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}