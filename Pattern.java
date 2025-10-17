public class Pattern {
    public static void main(String[] args) {
        int n = 9;
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        // pattern5(n);
        pattern6(n);
    }

// 4 4 4 4 4 4 4    0 0 0 0 0 0 0
// 4 3 3 3 3 3 4    0 1 1 1 1 1 0
// 4 3 2 2 2 3 4    0 1 2 2 2 1 0
// 4 3 2 1 2 3 4 or 0 1 2 3 2 1 0 (without n- part)
// 4 3 2 2 2 3 4    0 1 2 2 2 1 0
// 4 3 3 3 3 3 4    0 1 1 1 1 1 0
// 4 4 4 4 4 4 4    0 0 0 0 0 0 0
public static void pattern1(int n) {
    for (int i = 0; i < 2*n-1; i++) {
        for (int j = 0; j < 2*n-1; j++) {
            int top = i, bottom = (2*n-2)-i;
            int left = j, right = (2*n-2)-j;

        System.out.print((Math.min(Math.min(top,bottom), Math.min(left,right)))+" ");
        }
        System.out.println();
    }
}

// (effec. row)      (effec. col)
// 4 4 4 4 4 4 4     1 2 3 4 3 2 1     1 2 3 4 3 2 1   PATTERN 2
// 3 3 3 3 3 3 3     1 2 3 4 3 2 1     1 2 3 3 3 2 1
// 2 2 2 2 2 2 2     1 2 3 4 3 2 1     1 2 2 2 2 2 1
// 1 1 1 1 1 1 1  +  1 2 3 4 3 2 1  =  1 1 1 1 1 1 1
// 2 2 2 2 2 2 2     1 2 3 4 3 2 1     1 2 2 2 2 2 1
// 3 3 3 3 3 3 3     1 2 3 4 3 2 1     1 2 3 3 3 2 1
// 4 4 4 4 4 4 4     1 2 3 4 3 2 1     1 2 3 4 3 2 1
public static void pattern2(int n) {
    for (int i=0; i<2*n-1; i++) {
        for (int j=0; j<2*n-1; j++) {
            int top = i, bottom = 2*n-2-i;
            int left = j, right = 2*n-2-j;

            int effective_row = n - Math.min(top, bottom);
            int effective_col = 1 + Math.min(left,right);

            System.out.print(Math.min(effective_row, effective_col));
            if (j!=2*n-2) {System.out.print(" ");}
        }
        System.out.println();
    }
}

// 1 2 3 _ 3 2 1 (removed wherever row is effective or equal)
// 1 2 _ _ _ 2 1
// 1 _ _ _ _ _ 1
// _ _ _ _ _ _ _
// 1 _ _ _ _ _ 1
// 1 2 _ _ _ 2 1
// 1 2 3 _ 3 2 1
// 1 2 3 4 3 2 1 (add this line separately)
public static void pattern3(int n) {
    for (int i=0; i<2*n-1; i++) {
        for (int j=0; j<2*n-1; j++) {
            int top = i, bottom = 2*n-2-i;
            int left = j, right = 2*n-2-j;

            int effective_row = n - Math.min(top, bottom);
            int effective_col = 1 + Math.min(left,right);

            if (effective_row > effective_col) System.out.print(effective_col);
            else  System.out.print(" ");

            if (j!=2*n-2) {System.out.print(" ");}
        }
        System.out.println();
    }

    for (int i=0; i<2*n-1; i++) {
        System.out.print(1 + Math.min(i, 2*n-2-i) + " ");
    }
    System.out.println();
}

// ********
// ***__***
// **____**
// *______*
// *______*
// **____**
// ***__***
// ********
public static void pattern4(int n) {
    for (int i=0; i<n; i++) {
        for (int j=0; j<n-i; j++) {
            System.out.print("*");
        }
        for (int j=0; j<i*2; j++) {
            System.out.print("_");
        }
        for (int j=0; j<n-i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i=n-1; i>-1; i--) {
        for (int j=0; j<n-i; j++) {
            System.out.print("*");
        }
        for (int j=0; j<i*2; j++) {
            System.out.print("_");
        }
        for (int j=0; j<n-i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

// *_*_*_*
// *_*_*
// *_*
// *
public static void pattern5(int n) {
    for (int j=n; j>0; j--) {
        for (int i=2*j-1; i>0; i--) {
            if (i%2 == 0) System.out.print(" ");
            else System.out.print("*");
        }
        System.out.println();
    }
}

// _______*
// ______***
// _____*****
// ____*******
// ***************
// _*************
// __***********
// ___*********
// ___*********
// __***********
// _*************
// ***************
// ____*******
// _____*****
// ______***
// _______*
public static void pattern6(int n) {
    for (int i=0; i<n; i++) {
        for (int j=2*n-1-i; j>0; j--) {
            System.out.print(" ");
        }
        for (int j=0; j<2*i+1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i=1; i<2*n; i+=2) {
        for (int j=i/2; j>0; j--) {
            System.out.print(" ");
        }
        for (int j=4*n-i; j>0; j--) {
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i=2*n-1; i>=1; i-=2) {
        for (int j=i/2; j>0; j--) {
            System.out.print(" ");
        }
        for (int j=4*n-i; j>0; j--) {
            System.out.print("*");
        }
        System.out.println();
    }

    for (int i=n-1; i>-1; i--) {
        for (int j=2*n-1-i; j>0; j--) {
            System.out.print(" ");
        }
        for (int j=0; j<2*i+1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
