package lab1;

import java.util.Scanner;

public class CheckNumber {
	public static boolean checkNumber(int n)
	{
		boolean status=false;
		for(int i=1;i<=n;i++)
		{
			if(2*i == n)
			{
				status=true;
				break;
			}
		}
		if(status)
			System.out.println(n+ " is a power of 2 ");
		else
			System.out.println(n+ " is not a power of 2");
		return status;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		boolean status =false ;
		checkNumber(n);

		
	}

}
