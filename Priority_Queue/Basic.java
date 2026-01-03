package Priority_Queue;
import java.util.*;
public class Basic {
    public static void main(String[] args) {
// __________________________________________________________________________________________________________________________
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // only guarantees that minimum element is at 0th index
        pq.add(5); 
        pq.add(1); 
        pq.add(3); 
        pq.add(10); 
        pq.add(2); 
        System.out.println(pq.toString());
        // does not print in sorted order
        while (!pq.isEmpty()) {
            System.out.print(pq.poll()+" ");
        } // does print in sorted order
        System.out.println();
// __________________________________________________________________________________________________________________________
        // PEEK() / ELEMENT()
        // peek() return the minimum value of all
        // returns null when pq is empty
        System.out.println(pq.peek()); // null
        // element() return the head (also min) of all
        // throws error if pq is empty
        // System.out.println(pq.element()); // error since empty
// __________________________________________________________________________________________________________________________
        // ADD() / OFFER()
        // add return true, when falsy throws error
        // offer return true, when falsy return false
        pq.add(5);
        pq.offer(10); // both are truthy statements
    }
}
