package Maths;

import java.util.*;
public class Sieve_Of_Eratosthenes {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(brute_force(num));
        System.out.println(optimised(num));
        System.out.println(optimised_2(num));
        sc.close();
    }
    public static Vector<Integer> brute_force(int num) {
        Vector<Integer> res = new Vector<>();
        if (num <= 1) { return res; }
        res.add(2);
        if (num == 2) {
            return res;
        }
        for (int i=3; i<=num; i+=2) {
            if (Check_Prime.isPrime(i)) { res.add(i); }
        }
        return res;
    }
    public static Vector<Integer> optimised(int num) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=2; i<=num; i+=1) {
            map.put(i,1);
        }
        for (int i=2; i <= (int)(Math.sqrt(num)); i+=1){
            if (map.get(i) == 1) {
                for (int j = i*i; j <= num; j+= i) {
                    map.put(j,0);
                }
            }
        }
        Vector<Integer> res = new Vector<>();
        for (int i= 2; i <= num; i++) {
            if (map.get(i) == 1) {
                res.add(i);
            }
        }
        return res;
    }
    public static Vector<Integer> optimised_2(int num) {
        boolean[] map = new boolean[num+1]; // as it starts from 0
        for (int i=2; i<=num; i+=1) {
            map[i] = true;
        }
        for (int i=2; i*i <= num; i+=1){
            if (map[i]) {
                int j = i*i;
                while (j<=num) {
                    map[j] = false;
                    j+=i;
                }
            }
        }
        Vector<Integer> res = new Vector<>();
        for (int i= 2; i <= num; i++) {
            if (map[i]) {
                res.add(i);
            }
        }
        return res;
    }
}
