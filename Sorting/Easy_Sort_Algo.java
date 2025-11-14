package Sorting;
public class Easy_Sort_Algo {
// ________________________________________________________________________________________________________________________________

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            boolean flag = false; // start assuming no swaps
            for (int j=1; j<n-i; j++) {
                if (arr[j]<arr[j-1]) { 
                    Cyclic_Sort.swap(arr,j,j-1);
                    flag = true; // a swap occured
                }
            }
            if (!flag) break; // no swaps = already sorted
        }
    }
// ________________________________________________________________________________________________________________________________

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i=n-1; i>0; i--) {
            int maxIndex = getMaxIndex(arr,0,i);
            Cyclic_Sort.swap(arr,i,maxIndex);
        }
    }
    public static int getMaxIndex(int[] arr,int start,int end) {
        int max = start;
        for (int i=start+1; i<=end; i++) {
            if (arr[max]<arr[i]) max = i;
        }
        return max;
    }
// ________________________________________________________________________________________________________________________________

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j>0; j--) {
                if (arr[j]<arr[j-1]) Cyclic_Sort.swap(arr,j,j-1);
                else break;
            }
        }
    }
// ________________________________________________________________________________________________________________________________
    public static void main(String[] args) {
        int[] arr1 = new int[]{3,4,14,5,13,7,};
        bubbleSort(arr1);
        for (int e: arr1) {
            System.out.print(e+" ");
        }
        System.out.println();

        int[] arr2 = new int[]{3,4,14,5,13,7,};
        selectionSort(arr2);
        for (int e: arr2) {
            System.out.print(e+" ");
        }
        System.out.println();

        int[] arr3 = new int[]{3,4,14,5,13,7,};
        insertionSort(arr3);
        for (int e: arr3) {
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
