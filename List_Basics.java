import java.util.*;

public class List_Basics {
    public static void main(String[] args) {
        // Creating a list
        List<String> fruits = new ArrayList<>();
        // writing ArrayList just clarifies the type of list fruits is going to be
        // specify datatype in other <> when using it inside methods/subroutines
        // exact keywords for datatypes: String; Integer; Boolean; Double; Character
        // adding items to list
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("banana");

        // iterating the list
        // "enhanced for loop"; (or "for-each loop")
        for (String fruit : fruits)
            System.out.println(fruit);

        // changing a list of strings for integer to list of numbers
        fruits.clear(); // empties the list
        fruits.add("1");
        fruits.add("2");
        fruits.add("3");

        List<Integer> nums = new ArrayList<>();
        for (String num : fruits)
            nums.add(Integer.parseInt(num));
        // printing whole list (directly do it)
        System.out.println(nums);
        // get the element at index 0
        System.out.println(nums.get(0));
        // get the type of nums (class)
        System.out.println(nums.getClass().getName());
        // get the first element of list
        System.out.println(nums.getFirst());
        // get the last element of list
        System.out.println(nums.getLast());

        nums.add(0, -1); // adding element = -1 at an index 0
        System.out.println(nums);

        System.out.println(nums.size()); // get size of list

        nums.remove(0); // removing 0th indexed-element:

        // normal looping through list:
        // for (int i=0; i<nums.size(); i++) { System.out.println(nums.get(i));}

        nums.add(0,23);

        System.out.print("Index of element(23) : ");
        System.out.println(nums.indexOf(23)); // returns index of first occurence

        // slicing/subList from arr
        System.out.println(nums.subList(1, 1));
        // goes from l-->r-1 (same as in python); writing l,l will give empty list

        fruits.clear();
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("tomato");
        nums.sort(null); // sorting list; 
        // Alphabetical Order sorting:
        fruits.sort((a,b)->a.compareTo(b));
        // fruits.sort(String::compareTo); // simpler way to write

        // fruits.sort((a,b)->b.compareTo(a)); // Reverse* Order sorting
        System.out.println(fruits);

        // Sorting according to word length
        fruits.sort((a,b)->Integer.compare(a.length(), b.length()));
        // fruits.sort((a,b)->Integer.compare(b.length(), a.length())); // same task in reverse
        System.out.println(fruits);

        // Collections.sort(nums); // sorting list; another method
    }
}
