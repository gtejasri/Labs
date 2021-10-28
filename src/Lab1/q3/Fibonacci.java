package Lab1.q3;

import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter count");
		int count = sc.nextInt();
		int n1 = 1, n2 = 1, n3, i;
		System.out.println(n1);
		System.out.println(n2);
		for (i = 2; i < count; i++) {
			n3 = n1 + n2;
			System.out.println("" + n3);
			n1 = n2;
			n2 = n3;
		}
	}

}
