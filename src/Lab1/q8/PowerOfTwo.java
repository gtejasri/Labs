package Lab1.q8;

public class PowerOfTwo {

	static boolean isPowerOfTwo(int n) {
		if (n == 0)
			return false;

		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (isPowerOfTwo(5))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
