package excerise;

import java.util.Scanner;

public class StringReverse {
	public String getImage(String str) {
		StringBuffer sbr = new StringBuffer(str);
		sbr.append('|');
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		sbr.append(sb);
		return sbr.toString();
	}
	public static void main(String[] args) {
		StringReverse mi = new StringReverse();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.next();
		System.out.println(mi.getImage(str));
	}

}
