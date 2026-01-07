package Maths;
import java.util.*;
public class Sieve_Of_Eratosthenes {
    public static void main(String[] args) {
        int n = 50;

        System.out.println("Primes using Brute Force up to " + n + ":");
        System.out.println(generatePrimes_BF(n));

        System.out.println("\nPrimes using Sieve of Eratosthenes up to " + n + ":");
        System.out.println(generatePrimes_Sieve(n));
    }

/* Brute Force: O(N*sqrt(N)); O(1);
- checks primality of every number from 2 to num
- use a helper prime checking function */

    public static List<Integer> generatePrimes_BF(int num) {
        List<Integer> res = new Vector<>();
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

/* Sieve of Erastosthenes: O(Nlog(log(N))); O(N)
- assume all nums are prime initially
- mark multiples of each prime as non prime
- start marking from i*i (smaller multiples are already handled in previous loops) */

    public static List<Integer> generatePrimes_Sieve(int num) {
        List<Integer> res = new Vector<>();
        if (num <= 1) return res;

        // isPrime[i] indicates whether i is prime
        boolean[] isPrime = new boolean[num+1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false; // since 0 and 1 are not prime
        isPrime[1] = false;
        
        for (int i=2; i*i <= num; i+=1){
            if (isPrime[i]) {
                // mark all multiples of i as non primes
                for (int j=i*i; j<=num; j++) {
                    isPrime[j] = false;
                }
            }
        }

        // collect all primes
        for (int i= 2; i <= num; i++) {
            if (isPrime[i]) {
                res.add(i);
            }
        }
        return res;
    }
}