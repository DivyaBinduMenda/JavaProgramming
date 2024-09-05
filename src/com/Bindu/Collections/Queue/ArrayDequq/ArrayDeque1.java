package com.Bindu.Collections.Queue.ArrayDequq;

import java.util.ArrayDeque;

//Default capacity is 17 in arraydeque
//It is also not sorted order
//It is two way so  we can add and remove the elements from tail(last index) and  from head(0th index)



//Important points to remember
//1. What is the default capacity? (Capacity when elements are not added to the list)  //17
//2. What is the initial capacity?  //17
//3. Does it allow duplicate elements? //Yes
//4. Does it allow null values? /NO
//5. Does it maintain the insertion order? //No
//6. Does it maintain the sorted order? //No
//7. Does it offer the random access of elements? /No
//8. Is it synchronised? //No
//9. What is it good at?
public class ArrayDeque1 {
	public static void main(String[] args) {
		
		//Creation of ArrayQueue
		ArrayDeque<String> ad=new ArrayDeque<>();
		
		//Addition of elements
		//add(),addFirst(),addLast() or offer(),offerFirst(),offerLast()
		
		ad.add("Banana");
		ad.addFirst("Cherry");
		ad.addLast("Apple");
		ad.offerFirst("Kiwi");
		ad.offer("Pear");
		ad.offerLast("Mango");
		
		System.out.println(ad);
		System.out.println();
		
		//retreive elements
		//peek(),peekFirst(),peekLast()
		
		System.out.println(ad.peek());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		
		System.out.println();
		//To delete the elemets
		//poll(),pollFirst(),pollLast()
		
		System.out.println(ad.poll());
		System.out.println(ad);
		System.out.println(ad.pollFirst());
		System.out.println(ad);
		System.out.println(ad.pollLast());
		System.out.println(ad);
		
		
		
		
	}

}
