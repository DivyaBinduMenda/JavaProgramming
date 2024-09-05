package com.Bindu.Collections.List.vector;

import java.util.Vector;



//1)In vector we can add number of elements
//The default capacity of vector is 10
//2)It can allow duplicate values  and different data also
//3)In vector the size will increment by double (if we give (size)10 elements then the capacity is 10 , but if we give (size) 11 or more  elements up to 20 then the capacity will double like 20)
//4)So the capacity will increment  as double  with 100% 
//5)Vector follow the  insertion order to print
//6)But if we specify the index to print , it will print in specific index


//Questions

//What is the default capacity of vector? (Capacity when elements are not added to the list) //10 is fixed
//✴ What is the initial capacity of vector?  //10
//✴ Does vector allow duplicate elements? //Yes
//✴ Does vector allow null values?  //Yes
//✴ Does vector maintain the insertion order?   //Yes 
//✴ Does vector maintain the sorted order?   //No
//✴ Does vector offer the random access of elements?  //Yes
//✴ Is vector synchronized?  //yes , synchronized means the thread won't do to another thread until before thread work completes
//✴ What is vector good at? //Multithreading


public class Vector1 {
	
	public static void main(String[] args) {
		//Size:Number of elements present in list
		//capacity:Array capacity (how much such allocated)
		
		
		//Creation Of Elements
		
		Vector v1=new Vector();
		v1.add("Bindu");
		v1.add("12");
		v1.add("SINDHU");
		v1.add(2.0);
		v1.add(true);
		v1.add("Hi");
		v1.add(8.2f);
		v1.add(32);
		v1.add('c');
		v1.add("Avinash");
		v1.add("52");
		
		System.out.println(v1);
		System.out.println("Size :"+v1.size());
		System.out.println("Capacity :"+v1.capacity());
		
		System.out.println("=======");
		
		Vector v2=new Vector();
		
		v2.add("Bindu");
		v2.add("12");
		v2.add("SINDHU");
		v2.add(2.0);
		v2.add(true);
		v2.add("Hi");
		v2.add(8.2f);
		v2.add(32);
		v2.add('c');
		v2.add("Avinash");
		v2.add("52");
		v2.add("Bindu");
		v2.add("12");
		v2.add("SINDHU");
		v2.add(2.0);
		v2.add(true);
		v2.add("Hi");
		v2.add(8.2f);
		v2.add(32);
		v2.add('c');
		v2.add("Avinash");
		v2.add("52");
		
		System.out.println(v2);
		System.out.println("Size :"+v2.size());
		System.out.println("Capacity :"+v2.capacity());
		
		System.out.println("===");
		
		Vector v3=new Vector();
		
		v3.add("Bindu");
		v3.add("Sindhu");
		v3.add(0,"Nandhu");//POint 6
		
		System.out.println(v3);
		System.out.println("Size: "+v3.size());
		System.out.println("Capacity: "+v3.capacity());
		
		System.out.println("=====");
		
		Vector v4=new Vector();
		v4.add("Bindu");
		v4.add("Sindhu");
		v4.add("Chandu");
		
//		for(int i=0;i<v4.size();i++) {
//			v1.add(v4.get(i));
//		}
		
		v1.addAll(v4);//Here we are adding v4 elements to v1
		System.out.println(v1);
		
		System.out.println("=====");
		
		//Adding element to one object to another (v4 to v1)
		v1.addAll(0, v4);//Here also we are adding v4 elements to v1 , but mentioned the specific index , from where to start
		System.out.println(v1);
		
		
	    System.out.println("=====");
	
		//Retrieve of elements
		
		System.out.println(v2.get(3)); //It will get the element based on index
		
		System.out.println("====");
		
		//To remove the element 
		
		v1.remove(0); //It will remove the element based on index
		
		System.out.println(v1);
		
		System.out.println("=====");
		
		//To remove all elements in one object
		
		v1.removeAll(v4);
		
		System.out.println(v1);//It will remove the v4 elemnts from v1
		
		System.out.println("====");
		
		//To delete every element from object
		
		v1.clear();
		System.out.println(v1);
		
		System.out.println("===");
		
		//To verify or check whether the element is present in object or not
		
		System.out.println(v2.contains("Avinash"));
		
		System.out.println("====");
		
		//to check the all elements present in another object
		
		System.out.println(v2.containsAll(v4));
		
		System.out.println("====");
		
		//To update the elements
		
		v4.set(2,"Preethi");
		System.out.println(v4);
		
		System.out.println("=====");
		
		//To know the index of element
		
		
		System.out.println(v4.indexOf("Sindhu"));
		
		
	Vector<Integer> v6=new Vector<>();  //Used to add single data type only 
	v6.add(12);
	System.out.println(v6);
	
		
		
		
	}

}
