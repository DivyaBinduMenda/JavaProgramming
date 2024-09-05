package pattern_problmes;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int n=scan.nextInt();
		numberPattern(n);
	}

	private static void numberPattern(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=n;col>=row;col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}
}
