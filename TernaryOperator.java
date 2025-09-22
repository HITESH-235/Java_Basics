import java.util.*;

public class TernaryOperator {
    public static void main(String[] args) {
        // if n is even assign "Even" to x otherwise "Odd"
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String x = n%2 == 0? "n is Even" : "n is Odd";
        System.out.println(x);
        sc.close();
    }
}