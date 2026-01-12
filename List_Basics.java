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
        // get the last element of list

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
    }
}
