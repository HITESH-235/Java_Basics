package Maths;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int x = sc.nextInt();
        System.out.println(power(n,x));
        sc.close();
    }
    public static double power(long n, int x) {
        if (x == 0) {
            return 0;
        }
        if (x<0) {
            return 1.0/power(n,Math.abs(x));
        }
        long res = 1;
        while (x>0) {
            if (x%2 == 1) {
                res *= n;
                x -= 1;
            }
            else {
                x /= 2;
                n *= n;
            }
        }
        return res;
    }
}
