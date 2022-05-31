package lab1;

import java.util.Scanner;

public class CalculateDifference {
	public static int calculateDifference(int n)
	{
		int sum=0,sum1=0,sum2=0;
		
		for(int i=1;i<=n;i++)
		{
			
			sum+=(i*i);
			
		}
		for(int i=1;i<=n;i++)
		{
			sum1+=i;
		}
		sum2+=(sum1*sum1);
		
		int difference=sum-sum2;
		return difference;
	
		
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		System.out.println("The Differences between the sum of the squares of the natural numbers and square of sum " +calculateDifference(n));
	}

}
