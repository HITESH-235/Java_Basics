package Maths;

import java.util.Scanner;

public class Check_ArmStrong {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(isArmStrong(num));
        sc.close();
    }
    public static boolean isArmStrong(long num) {
        int count = 0;
        long temp = num;
        while (temp>0) {
            temp /= 10;
            count += 1;
        }
        long total = 0;
        long dup = num;
        int last;
        while (dup > 0) {
            last = (int)dup%10;
            dup /= 10;
            total += Math.pow(last, count);
        }
        return (total == num);
    }
}