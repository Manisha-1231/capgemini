package lab1;

import java.util.Scanner;

public class CheckIncreasing {
	public static boolean checkNumber(int num)
	{
		

		String check = String.valueOf(num);
		int length = check.length();
		for(int i=0; i<length-1; i++) {
			if(check.charAt(i) <= check.charAt(i+1)) {
				continue;
			}
			else 
				return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		boolean flag = false;
		checkNumber(n);
		if(flag){
	           System.out.println(n+ " is in increasing order.");
	       }else{
	           System.out.println(n+ " is not an increasing order.");
	       }
		}

}
