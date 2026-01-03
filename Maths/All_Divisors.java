package Maths;
import java.util.*;
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

    public List<Integer> Divisors_SOE(int num) {
        if (num <= 0) return List.of();
        if (num == 1) return List.of(1);

        int[] spf = new int[num+1];
        for (int i=1; i<=num; i++) {
            spf[i] = i;
        }
        for (int i=2; i*i<=num; i++) {
            if (spf[i] == i) {
                for (int j=i*i; j<=num; j+=i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
        Map<Integer,Integer> factors = new HashMap<>();
        int dup = num;
        while (dup > 1) {
            int p = spf[dup];
            factors.put(p, factors.getOrDefault(p, 0)+1);
            dup /= p;
        }

        List<Integer> divisors = new ArrayList<>();
        divisors.add(1);
        for (int prime: factors.keySet()) {
            int power = factors.get(prime);
            int size = divisors.size();
            int curr = 1;
            for (int p=1; p<=power; p++) {
                curr *= prime;
                for (int i=0; i<size; i++) {
                    divisors.add(divisors.get(i)*curr);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
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
