package Lab2.q1;

import java.util.Arrays;

public class SmallestArray {

	public static int getSecondSmallest(int[] a, int total) {
		Arrays.sort(a);
		return a[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 88, 44, 66, 99, 33, 77, 22, 11, 55 };
		System.out.println("Second Smallest: " + getSecondSmallest(a, 8));

	}

}
