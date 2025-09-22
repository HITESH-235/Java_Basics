public class Loops {
    public static void main(String[] args) {
        // while (true) {
        //     System.out.println("Hi");
        // }
        int i = 0;
        while (i<=5) {
            System.out.printf("Hi %1d",i); // or %d only (no need to write 1)
            System.out.println();
            i = i + 1;
        }
        // do while loops - checks for condition after execution of code in block
        // hence it goes 1 step beyond conpared to while loop with same condition
        int j = 0;
        do{
            System.out.println(i);
            j++;
        }while (j<=5);

        // for loops
        for (int n=0; n<=5; n++) {
            System.out.printf("Day:%d ",n);

        }

        //skipping parameters of for loop
        int m = 0;
        for (;m<=5;) {
            System.out.println(m);
            m++;
        } // works the same
    }
}
