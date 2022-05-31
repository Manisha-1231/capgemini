package com.cg.eis.exception;

import java.util.Scanner;

public class ExceptionSalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Salary : ");
		int salary = sc.nextInt();
		try
		{
			if(salary < 3000)
				throw new InvalidSalary("Invalid Salary....");
			else
				System.out.println("Valid Salary....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
