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
        fruits.sort((a,b)->Integer.compare(a.length(), b.length()));
        // fruits.sort((a,b)->Integer.compare(b.length(), a.length())); // same task in reverse
        System.out.println(fruits);

    }
}
