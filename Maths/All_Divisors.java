package Maths;

import java.util.Scanner;
import java.util.Vector;

public class All_Divisors {
    public static Vector<Integer> Divisors(int num) {

    // public static void Divisors(int num) {
        Vector<Integer> res = new Vector<>();
        for (int i=1; i<= (int)(Math.sqrt(num)+1); i+= 2) {
            if (num%i == 0) {
                int j = num/i;
                res.add(i);
                if (i != j) {
                    res.add(j);
                }
            }
        }
        // for (int i = 0; i<res.size(); i+=1) {
        //     System.out.printf("Divisor %d: %d%n",i+1,res.get(i));
        // }
        // System.out.printf("All Divisors: %s",res);
        return res;
    }

    public static int Count_Divisors(int num) {
        int count = 0;
        for (int i=1; i*i <= num; i++) {
            if (num%i == 0) {
                if (num/i != i) count += 2;
                else count += 1;
            }
        }
        return count;
    }
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("All Divisors: %s",Divisors(num));
        System.out.println();
        System.out.printf("Count of all divisors: %d",Count_Divisors(num));
        sc.close();
    }
}
