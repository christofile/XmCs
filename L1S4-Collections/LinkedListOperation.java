package L1S4;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOperation {
	
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Lily");
		ll.add("Donnie");
		ll.add("Kevin");
		ll.add("Todd");
		
		System.out.println("Original Linkedlist:");
		System.out.println(ll);
		//a. Swap two elements
		Collections.swap(ll, 0, 1);
		System.out.println("LinkedList after swapping first and second element");
		System.out.println(ll);
		//b. Shuffle elements in Linked List
		Collections.shuffle(ll);
		System.out.println("LinkedList after suffling");
		System.out.println(ll);
		//c. Iterate through LinkedList in reverse order.
		System.out.println("LinkedList after iterating");
        Iterator<String> itr = ll.descendingIterator();
        LinkedList<String> ll2 = new LinkedList<String>();
        while(itr.hasNext()){
            ll2.add(itr.next());
        }        
        System.out.println(ll2);
		//d. push() and pop() operations on Linkedlist.
        ll2.pop();
        System.out.println("LinkedList after poping");
        System.out.println(ll2);
        ll2.push("Aaron");
        System.out.println("LinkedList after pushing");
        System.out.println(ll2);
        
	}
}
