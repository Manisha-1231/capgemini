// Prime : The number which is divided by 1 and it self is known as Prime Number

package lab1;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		boolean isPrime = true;
		for(int i=2;i<n; i++)
		{
			if(n%i==0)
			{
				isPrime=true;
				break;
				
			}
		}
		if(isPrime)
			System.out.println(n+ " is a prime number");
		else
			System.out.println(n+ " is not a prime number");
	}
}
