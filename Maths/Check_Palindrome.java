package Maths;

import java.util.Scanner;

public class Check_Palindrome {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(isPalindrome(num));
        sc.close();
    }
    public static boolean isPalindrome(long num) {
        int last;
        long dup = num;
        long reverse = 0;
        while (dup>0) {
            last = (int)(dup%10);
            dup /= 10;
            reverse *= 10;
            reverse += last;
        }
        return (reverse == num);
    }
}

