package com.kunal.Searching;


// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
import java.util.Scanner;

public class LS_Even_Digit_Count_9 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr= {12,345,2,6,7896};
		System.out.print("The number of even elements are : ");
		
		System.out.println(findNumbers(arr));
		
	}
	
	
		
	//To check how many even digit counts of elements are there
	public static int findNumbers(int[] arr) {
        int count=0;
       for(int num:arr){
        if(even(num)){
            count++;
        }
        
       }
       return count;
    }
   // To check the digit count of element is even or odd 
    public static boolean even(int num){
        int count=everyDigitCount(num);
        
//        if(count%2==0) {
//        	return true;
//        }
//        return false;
        
        return count%2==0;
    }
  //To check the digit count of every element in array
    public static int everyDigitCount(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }

}
