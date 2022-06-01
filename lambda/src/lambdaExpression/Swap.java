/* 2. Swap two numbers
     x=10, y=30
 */


package lambdaExpression;

interface Intr2 {

	// abstract method
	void swap(int a, int b);
}

public class Swap {
	public static void main(String[] args) {

		Intr2 reference = (a, b) -> {
			int temp = a;
			a = b;
			b = temp;
			System.out.println("after swapping the element a is " + a + " and b is " + b);

		};
		reference.swap(10, 30);

}
}
