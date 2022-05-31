package exercise1;

public class SecondSmallest {
	public static int getSecondSmallest(int[] intArr) {

		// sort the Array

		for (int i = 0; i <= intArr.length - 1; i++) {
			for (int j = i + 1; j <= intArr.length - 1; j++) {
				if (intArr[i] > intArr[j]) {
					int temp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = temp;
				}
			}
		}

		// after sort the elements i am getting second smallest element that why i am
		// writing intArr[1]

		return intArr[1];

	}

	public static void main(String[] args) {
		int[] intArr = { 9, 10, 7, 6, 8, 4 };

		System.out.println("The second smallest element is " +getSecondSmallest(intArr));

	}


}
