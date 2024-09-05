package pattern_problmes;

import java.util.Scanner;

//Enter the number of rows
//5
//* * * * * 
//* * * * * 
//* * * * * 
//* * * * * 
//* * * * * 


public class Pattern1 {
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n=scan.nextInt();
		starPattern(n);
		
	}
	public static void starPattern(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
