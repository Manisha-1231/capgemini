// Fibonacci : the previous to fibonacci number summation is the next fibonacci number

package lab1;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.print(n1 + " " + n2);
		for (int i = 3; i <= n; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println();
	}

}
