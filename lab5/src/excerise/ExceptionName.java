package excerise;

import java.util.Scanner;

public class ExceptionName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name : ");
		String firstName=sc.nextLine();
		System.out.println("Enter Last Name : ");
		String lastName=sc.nextLine();
		try {
			if((firstName.length()==0) && (lastName.length()==0))
				throw new InvalidName(" Invalid Characters ");
			else
				System.out.println("Valid Name....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
