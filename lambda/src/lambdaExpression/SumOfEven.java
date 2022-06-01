/*Find sum of even numbers from below array
    int[] arr = { 11,29,31,45,5,34};
    */
package lambdaExpression;
interface Intr5 {
	int evenSum(int arr[]);

}

public class SumOfEven {
	public static void main(String[] args) {

		// declare the array
		int[] arr = { 11, 29, 31, 45, 5, 34 };

		Intr5 ref = (a) -> {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				
				// to check element is even or odd
				if (arr[i] % 2 == 0) {
					sum += a[i];
				}
			}
			System.out.println("The sum of even number is : ");

			return sum;

		};
		System.out.println(ref.evenSum(arr));
	}

}
