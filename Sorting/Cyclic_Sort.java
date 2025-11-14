package Sorting;
import java.util.*;

public class Cyclic_Sort {
    public static void cyclicSort(int[] arr, int start) {
        int n = arr.length;
        int i=0;
        while (i<n) {
            int correct = arr[i]-start;
            // Only swap if value is in range and not at its correct position
            if (correct<arr.length && arr[correct] != arr[i]) {
                swap(arr,i,correct);
            }
            else i++;
        }
    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
// ________________________________________________________________________________________________________________________________

    // LEETCODE link: 
    // Find the first missing positive number in arr ranging from 0 to n
    public static int firstMissingPositive(int[] arr) {
        cyclicSort(arr, 0);
        int res = 0;
        for (int e: arr) {
            if (e != res) {
                return res;
            }
            res++;
        }
        return res;
    }
// ________________________________________________________________________________________________________________________________

    // LEETCODE link: 
    // Find all disappeared nums in arr ranging from 1 to n (len = n)
    // (8): 4,3,2,7,8,2,3,1: (5,6)
    // in BF sol, use set to store and then traverse from 1 to n for which are not in set
    public static List<Integer> allMissingPositives(int[] arr) {
        cyclicSort(arr, 1);
        // 1 2 3 4 3 2 7 8 after sorting
        List<Integer> res = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != i+1) res.add(i+1);
        }
        return res;
    }
// ________________________________________________________________________________________________________________________________

    // LEETCODE link: https://leetcode.com/problems/find-the-duplicate-number/description/
    // Given an arr of (N+1) length, with nums ranging from 1 to N
    // hence one of the nums is repeated, return it
    // Brute Force method would be to iterate over arr and store in set, if set contains already, return this num
    public static int findDuplicate(int[] arr) {
        int i = 0, n = arr.length;
        while (i<n) {
            if (arr[i] != i+1) {
                int correct = arr[i]-1;
                if (arr[correct] != arr[i]) {
                    swap(arr,i,correct);
                }
                else return arr[i];
            }
            else i++;
        }
        return -1;
    }
// ________________________________________________________________________________________________________________________________

    // LEETCODE link: https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
    // Given an arr of length N, with nums ranging from 1 to N
    // each of its element appears twice in the arr, return an arr of elements that appears twice
    // Brute Force method would be to use N^2 method or hashmap to do in O(N^2) TC & O(N) SC respec.
    public static List<Integer> findAllDuplicates_Sort(int[] arr) {
        int n = arr.length;
        List<Integer> res = new ArrayList<>();
        
        cyclicSort(arr, 1);
        for (int i=0; i<n; i++) {
            if (arr[i] != i+1) res.add(arr[i]);
        }
        return res;
    }

    public static List<Integer> findAllDuplicates_Neg(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for (int e: arr) {
            e = Math.abs(e); // taking +ve anyways
            if (arr[e-1] < 0) res.add(e); // checking if corresp. index is already -ve
            else arr[e-1] = -arr[e-1]; // making elements corresp. index -ve on first visit
        }
        return res;
    }
// ________________________________________________________________________________________________________________________________

    // LEETCODE link: https://leetcode.com/problems/set-mismatch/description/
    // Given an arr of length N, ranging nums from 1 to N
    // a num in range could have been repeated, resulting in no presence of some other num
    // return both nums as a res arr (given always testcases have such nums)
    public static int[] setMismatch_BF(int[] arr) {
        int[] res = new int[2]; // [duplicate, missing]
        int n = arr.length;
        for (int i=0; i<=n; i++) {
            int c = 0;
            for (int e: arr) {
                if (e==i) c++;
            }
            if (c == 2) res[0] = i;
            if (c == 0) res[1] = i;
        }
        return res;
    }
    public static int[] setMismatch_Hash(int[] arr) {
         int[] res = new int[2]; // [duplicate, missing]
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int e:arr) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        for (int i=1; i<=n; i++) {
            int freq = map.getOrDefault(i,0);
            if (freq == 2) res[0] = i;
            if (freq == 0) res[1] = i;
        }
        return res;
    }
    public static int[] setMismatch_Sort(int[] arr) {
        cyclicSort(arr,1);
        int curr = 1;
        for (int e: arr) {
            if (e != curr) {
                return new int[]{e,curr};
            }
            curr++;
        }
        return new int[]{0,0};
    }
    public static int[] setMismatch_Neg(int[] arr) {
        int n = arr.length;
        int total = n*(n+1)/2;
        int dup = 0;
        for (int e: arr) {
            e = Math.abs(e);
            total -= e;
            if (arr[e-1] < 0) {
                dup = e;
                total += e;
            }
            arr[e-1] = -arr[e-1];
        }
        return new int[]{dup,total};
    }
// ________________________________________________________________________________________________________________________________

    public static void main(String[] args) {
        // simply sorting the array ranging from 2 to 5
        int[] arr1 = new int[]{5,4,3,2};
        cyclicSort(arr1, 2);
        for (int e: arr1) {
            System.out.print(e+" ");
        }
        System.out.println();
        

        int[] arr2 = new int[]{5,4,3,2,1,0};
        System.out.println(firstMissingPositive(arr2)); // 6

        int[] arr3 = new int[]{4,3,2,7,8,2,3,1}; // 5,6
        for (int e: (allMissingPositives(arr3))) {
            System.out.print(e+" ");
        }
        System.out.println();


        int[] arr4 = new int[]{4,3,5,6,2,3,1}; // 3   
        System.out.println(findDuplicate(arr4));


        int[] arr5 = new int[]{4,3,2,7,8,2,3,1}; // 2,3    
        for (int e: findAllDuplicates_Sort(arr5)) {
            System.out.print(e+" ");
        }
        System.out.println();


        int[] arr6 = new int[]{1,2,3,4,4}; // 4,5
        for (int e: setMismatch_Neg(arr6)) {
            System.out.print(e+" ");
        }
        System.out.println();
    }
}