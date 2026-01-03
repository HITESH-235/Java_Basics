package Priority_Queue;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        // Method 1: Using collections class:
        // PriorityQueue<Integer> pq2 = 
                // new PriorityQueue<>(Collections.reverseOrder());

        // Method 2: Using explicit comparater (recommended):
        PriorityQueue<Integer> pq = 
                new PriorityQueue<>((a,b) -> (b-a));
        // negative: first num will be first (a)
        // zero: equal priority
        // positive: latter num will be first (b)

        // in this example, if (b>a) then b-a = (+)
        // hence b is of more priority (popped first)

        // default case: (a,b) -> (a-b)
        // this can overflow for out of range integers
        pq.offer(3); 
        pq.offer(2); 
        pq.offer(1); 
        pq.offer(10); 
        pq.offer(5); 
        while (!pq.isEmpty()) {
            System.out.print(pq.poll()+" ");
        } 
        // 10 5 3 2 1 expected
        System.out.println();
    }
}
