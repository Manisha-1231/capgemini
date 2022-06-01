package lambdaExpression;
interface Intr3 {

	// abstract method
	String reverse(String n);
}
public class StringReverse {public static void main(String[] args) {

	// declare a reference to MyInterface
	// assign lambda expression
	Intr3 ref = (str) -> {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--)
			result += str.charAt(i);
		return result;

	};
	System.out.println("string reverse by using lamda expression is : " + ref.reverse("manisha"));

}

	

}
