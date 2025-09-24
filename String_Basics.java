import java.util.*;

public class String_Basics {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());


        String txt2 = "Hello World";
        System.out.println("Hello World in uppercase: " + txt2.toUpperCase());
        System.out.println("Hello World in lowerercase: " + txt2.toLowerCase());


        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate")); // Outputs 7
        // returns index of first occurence


        System.out.println(txt2.charAt(0)); // H
        System.out.println(txt2.charAt(4)); // O


        String txt4 = "   Hello World   ";
        System.out.println("Before : ["+txt4+"]");
        System.out.println("After : ["+txt4.trim()+"]"); // but does not change the value 


        String txt5 = "This#is#a#sentence#separated#by#hashes!";
        // System.out.println(txt5.split("#")); // [Ljava.lang.String;@7344699f
        // List<String> words = new ArrayList<>(); // Will not work for storing split() items
        // words = txt5.split("#"); //  puts error; type mismatch
        String[] words = txt5.split("#",5); // only .split("#") will separate all words
        for (String s: words) 
            System.out.print(s+" ");
        // split accepts two parameters; one (required) is separater (default " ") and other (optional) int type as max length of return array
        // hence it appends to the nth index words; whatever the rest of string is left

        System.out.println();
        System.out.println(txt5.startsWith("This")); // true
        System.out.println(txt5.startsWith("is")); // false

        // Subsequences*
        System.out.println(txt2.subSequence(0, 7)); // beginindex: inclusive; endIndex: exclusive;
        // String sub = txt2.subSequence(0, 7) // throws error; type mismatch
        CharSequence sub = txt2.subSequence(0, 7); // we can only store subseqeunces in type CharSequence
        System.out.println(sub); // CharSequence takes lesser memory than Strings

        // Substrings*
        System.out.println(txt2.substring(0,7)); // same as subsequence
        String sub2 = txt2.substring(0,7); // but can be stores in String
        System.out.println(sub2);


        // String.valueof(object): returns any object as a string
        char[] myArray = {'a','b','c'};
        System.out.println(String.valueOf(myArray));
        System.out.println(String.valueOf('A'));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(4.5f));
        System.out.println(String.valueOf(5.2));
        System.out.println(String.valueOf(12));
        System.out.println(String.valueOf(1400L));
        // does work on list but returns "[23,3,2]"
        List<Integer> lst = new ArrayList<>();
        lst.add(23);
        lst.add(3);
        lst.add(2);
        System.out.println(String.valueOf(lst));
    }
}
