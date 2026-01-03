package Maths;
import java.util.*;

public class Prime_Factors {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(PrimeFactors(num));
        System.out.println(Optimised(num));
        sc.close();
    }
 
    public static Vector<Integer> PrimeFactors(int num) {
        Vector<Integer> res = new Vector<>();
        // int other;
        for (int i=1; i<(int)(Math.sqrt(num)+1);i+=1) {
            if (num%i == 0 && Check_Prime.isPrime(i)) { 
                res.add(i);
                int other = num/i;
                if ((other) != i && Check_Prime.isPrime(other)) {
                    res.add(other);
                }
            }
        }
        return res;
    }

    public static Vector<Integer> Optimised(int num){
        Vector<Integer> res = new Vector<>();
        for (int i=2; i<=(int)(Math.sqrt(num)+1); i+=1) {
            if (num%i == 0) {
                res.add(i);
                while (num%i == 0) {
                    num /= i;
                }
            }
        }
        if (num != 1) { res.add(num); }
        return res;
    }
}