package com.Bindu.Collections.Queue.PriorityQueue;

import java.util.PriorityQueue;
//Default capacity is 11 in priority queue
//PriorityQueue don't follow the sorted order(no ascending and no descending)
//It will print in random order
//But it will print the element of 0th index (head) is the lowest Integer(Highest Order)
//It is one way so we can  only add the elements from tail(last index) and remove from head(0th index)


//Important points to remember
//1. What is the default capacity? (Capacity when elements are not added to the list) //11
//2. What is the initial capacity? //11
//3. Does it allow duplicate elements? //yes
//4. Does it allow null values? //No
//5. Does it maintain the insertion order? //No
//6. Does it maintain the sorted order?  //No
//7. Does it offer the random access of elements? //No
//8. Is it synchronised? //No
//9. What is it good at? //When priority matteres
public class PriorityQueue1 {

	public static void main(String[] args) {
		
//		• Creation of a Priorityqueue
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
//		• Addition of elements into the queue
		//We can add by using add() or offer()
		pq.add(15);
		pq.add(12);
		pq.add(5);
		pq.offer(18);
		pq.add(1);
		System.out.println(pq);
		System.out.println();
		
		
		
//		Retrieval of elements from the queue
		//We can retirive only head(0th index) element
		//To retrive , the methos is peek()
		System.out.println(pq.peek());
		System.out.println();
//		• Deletion of elements from the queue
		//we can only delete head (0th index) by using poll() or remove()
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println();
		
//		• Verification of elements in the queue
		
		System.out.println(pq.contains(12));
		

		
		

	}
	
}
