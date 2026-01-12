import java.util.*;

public class List_Sorting {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(); // a list containing words
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("tomato");

        List<Integer> nums = new ArrayList<>(); // a list containing numbers
        nums.add(23);
        nums.add(3);
        nums.add(37);
        nums.add(16);
        nums.add(0);

        // normal sorting (integers)
        nums.sort(null); // sorting list; 
        // nums.sort((a,b)->Integer.compare(b, a)); // reverse normal sorting
        System.out.println(nums);

        // *Alphabetical* Order sorting (first letter):
        fruits.sort((a,b)->a.compareTo(b));
        // fruits.sort(String::compareTo); // simpler way to write
        // Collections.sort(nums); // sorting list; another method

        // fruits.sort((a,b)->b.compareTo(a)); // *Reverse* Order sorting
        System.out.println(fruits);

        // Sorting according to *word length*
        fruits.sort((a,b)-> Integer.compare(a.length(), b.length()));
        fruits.sort((a,b)-> a.length()-b.length());
        // fruits.sort((a,b)->Integer.compare(b.length(), a.length())); // same task in reverse
        System.out.println(fruits);


        Integer[] arr = {2,4,3,4,5,2,5,2}; // lambda exp 
        Arrays.sort(arr, (a,b) -> b-a);
        System.out.println(Arrays.toString(arr));

        String[] arr2 = {"fsdf","dfsdf","sdgpawvnma", "panbmaommsl"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        Integer[] arr3 = {32,5,542,6,3,2,3,5324,52,3423,42};
        Arrays.sort(arr3, (a,b)->{
            int fa = countFactors(a);
            int fb = countFactors(b);
            if (fa == fb) return a-b;
            return fa-fb;
        });
        System.out.println(Arrays.toString(arr3));

        arr3 = new Integer[]{32,5,542,6,3,2,3,5324,52,3423,42};
        Arrays.sort(arr3, (a,b)->
            Integer.compare(countFactors(a), countFactors(b))
        );
        System.out.println(Arrays.toString(arr3));

        arr3 = new Integer[]{32,5,542,6,3,2,3,5324,52,3423,42};
        Arrays.sort(arr3, (b, a) -> {
            int cmp = Integer.compare(countFactors(a), countFactors(b));
            if (cmp != 0) return cmp;
            return Integer.compare(a, b);
        }); // write a,b -> b,a to get descending
        System.out.println(Arrays.toString(arr3));
    }

    static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n) count++;   // perfect square
                else count += 2;          // i and n/i
            }
        }
        return count;
    }
}
