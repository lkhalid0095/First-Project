package search;

public class FibonacciSequence {

	public static void main(String[] args) {
		int n = 4;
		System.out.println(fibNumbers(n));

	}
	public static int fibNumbers(int n) {
		
		if(n == 0 || n == 1) {
			return 1;
		}
		else {
			return fibNumbers(n-1) + fibNumbers(n-2);
		}
	}

}
