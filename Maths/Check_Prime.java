// Return True or False if a number is prime or not

package Maths;
import java.util.Scanner;

// public class Check_Prime {
//     public static void main(String[] arg) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if (num <= 1){
//             System.out.println(false);
//         }
//         else if (num%2 == 0){
//             System.out.println(num == 2);
//         }
//         else {
//             boolean flag = true;
//             for (int i=3; i<=(int)(Math.sqrt(num)+1);i+=2) {
//                 if (num%i == 0) {
//                     System.out.println(false);
//                     flag = false;
//                     break;
//                 }
//             }
//             if (flag) {
//                 System.out.println(true);
//             }
//         sc.close();
//         }
//     }
// }
public class Check_Prime {

    public static boolean isPrime(int num) {
        if (num <= 1) { return false; }
        if (num % 2 == 0) { return num == 2; }
        for (int i = 3; i <= (int)(Math.sqrt(num)); i+=2) {
            if (num%i == 0) { return false; }
        }
        return true;
    }
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPrime(num));
        sc.close();
    }
}