package MATRIX;

public class Anti_Diagonals {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{1,2},{3,4}};
        int[][] res = antiDiagonals(mat);
        for (int[] arr: res) {
            for (int e:arr) {
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }   

public static int[][] antiDiagonals(int[][] mat) {
    int n = mat.length;
    int[][] res = new int[n*2-1][n];

    for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++) {
            if (i+j<=2*n-1) {
                for (int k=0; k<n; k++) {
                    if (res[i+j][k] == 0) {
                        res[i+j][k] = mat[i][j];
                        break;
                    }
                }
            }
        }
    }
    return res;
}
}
