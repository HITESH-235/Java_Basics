package Maths;
import java.util.Scanner;
// import java.math.*;
public class Count_Digits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = num;
        int count = 0;
        while (num>0) {
            num = num/10;
            count = count + 1;
        }
        System.out.printf("Through looping: %d",count);
        System.out.println();
        logarithmic(num2);
        sc.close();
    }
    public static void logarithmic(int num) {
        int count2 = (int)(Math.log10(num) + 1);
        System.out.printf("Through Logarithm: %d",count2);
    }
}