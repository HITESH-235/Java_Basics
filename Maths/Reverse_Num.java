package Maths;
import java.util.Scanner;
public class Reverse_Num {
    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     long num = sc.nextLong();
    //     long res = 0;
    //     int last;
    //     while (num>0) {
    //         last = (int)(num%10);
    //         num = num/10;
    //         res =  (res*10) + last;
    //     }
    //     System.out.println(res);
    //     sc.close();
    // }
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(Reverse(num));
        sc.close();
    }
    public static long Reverse(long num) {
        long res = 0;
        int last;
        while (num > 0) {
            last = (int)(num%10);
            num /= 10;
            res = (res*10) + last;
        }
        return res;
    }
}
