package excerise;

import java.util.Scanner;

public class ExceptionAge {
	public static void main(String[] args) {
		System.out.println("Enter the Age : ");
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		try {
			if(age < 15)
				throw new InvalidAge("Invalid Age..");
			else
				System.out.println("Valid Age...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
