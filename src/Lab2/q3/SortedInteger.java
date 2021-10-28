package Lab2.q3;

import java.util.Arrays;

public class SortedInteger {

	public static int getSorted(int arr[], int n) {
		System.out.println("Reverse order:");
		for (int i = arr.length - 1; i >= 0; i--)
			System.out.print(arr[i] + "  ");

		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 30, 50, 80, 60, 20 };
		int n = arr.length;
		SortedInteger.getSorted(arr, n);
		System.out.println("\n");
		Arrays.sort(arr);
		System.out.println("Sorted Order:");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "  ");

	}

}