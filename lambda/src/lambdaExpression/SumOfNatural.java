package lambdaExpression;

interface Intr1
{
	int naturalSum(int n);
}

public class SumOfNatural {
public static void main(String[] args) {
		
		Intr1 ref=(n) ->
		{
			
		return n*(n+1)/2;
			
		};
		System.out.println("The sum of natural numbers : " +ref.naturalSum(5));
		
	}

}
