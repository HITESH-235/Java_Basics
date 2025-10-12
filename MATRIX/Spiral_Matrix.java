package MATRIX;

public class Spiral_Matrix {
    public static void main(String[] args) {
       printSpiralMatrix(spiralMatrix(31)); 
    }
public static int[][] spiralMatrix(int n) {
    int[][] res = new int[n][n];

    int left = 0, right = n-1;
    int top = 0, bottom = n-1;

    int curr = 1;
    while (curr<=n*n) {
        for (int j=left; j<=right; j++) {
            res[top][j] = curr;
            curr++;
        }
        top++;
        for (int j=top; j<=bottom; j++) {
            res[j][right] = curr;
            curr++;
        }
        right--;
        for (int j=right; j>=left; j--) {
            res[bottom][j] = curr;
            curr++;
        }
        bottom--;
        for (int j=bottom; j>=top; j--) {
            res[j][left] = curr;
            curr++;
        }
        left++;
    }
    return res;
}

public static void printSpiralMatrix(int[][] mat) {
    for (int[] arr: mat) {
        for (int e: arr) {
            if (e<10) System.out.print(e+"   ");
            else if (e>=10 && e<100) System.out.print(e+"  ");
            else System.out.print(e+" ");
        }
        System.out.println();
    }
}
}
