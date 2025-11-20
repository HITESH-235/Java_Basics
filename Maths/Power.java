// -100.0 < base < 100.0
// -231 <= exp <= 231-1
// exp is an integer.
// Either base is not zero or exp > 0.
// -10^4 <= base^exp <= 10^4
// LEETCODE link: https://leetcode.com/problems/powx-n/description/

package Maths;
public class Power {
    public static void main(String[] args) {
        System.out.println(power(2,-31));
    }
public static double power(double base, int exp) {
    if (exp == 0 || base == 1) return 1;

    long exp2 = exp;
    if (exp2<0) {
        base = 1.0/base;
        exp2 = -exp2;
    }

    double res = 1;
    while (exp2>0) {
        if (exp2%2 != 0) {
            res *= base;
            exp2 -= 1;
        }
        else {
            base *= base;
            exp2 >>= 1;
        }
    }
    return res;
}
} 
