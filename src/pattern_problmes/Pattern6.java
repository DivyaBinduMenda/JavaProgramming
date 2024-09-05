package pattern_problmes;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		
		int n=scan.nextInt();
		numberPattern(n);
	}

	private static void numberPattern(int n) {
		for(int row=n;row>=1;row--) {
			for(int col=row;col>=1;col--) {
				for(int space=0;space<=row;space++) {
				System.out.print(col+" ");
				}
			}
			System.out.println();
			
		}
		
	}
}
