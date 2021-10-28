package Lab1.q4;

import java.util.*;

public class PrimeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter n value:  ");
		int n = sc.nextInt();
		System.out.println("\nPrimenumbers are : ");
		for (int i = 2; i <= n; i++) {
			f = 0;
			for (int j = 2; j <= i / 2; j++)
				if ((i % j) == 0) {
					f = 1;
					break;
				}
			if (f == 0)
				System.out.print(i + "   ");
		}

	}

}
