package pattern_problmes;

import java.util.Scanner;

//Enter the number of rows
//5
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 

public class Pattern4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n=scan.nextInt();
		
		numberPattern(n);
		
	}

	private static void numberPattern(int n) {
		for(int row=1;row<=n;row++){
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
				
		
	}

}
