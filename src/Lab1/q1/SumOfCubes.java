package Lab1.q1;

public class SumOfCubes {
	public static int sumOfSeries(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i * i * i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(sumOfSeries(n));

	}

}
