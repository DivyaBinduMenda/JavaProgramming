package com.Bindu.BinarySearch;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class LC_FindTheSmallestNum_Ceiling_6 {
	public static void main(String[] args) {
		char[] letters= {'c','f','j'};
		char target='c';
		char ans=ceiling(letters,target);
		System.out.println(ans);
	}
	public static char ceiling(char[] letters,char target) {
		int start=0;
		int end=letters.length-1;
		
		if(target>=letters[end]) {
			return letters[start];
		}
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(target>=letters[mid]) {
				start=mid+1;
				
			}
			else {
				end=mid-1;
			}
		}
		return letters[start];
		
	}
	

}
