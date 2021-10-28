package Lab2.q1;

import java.util.Arrays;
import java.util.Scanner;
public class SmallestArray {

	public static int getSecondSmallest(int[] a, int total) {
		Arrays.sort(a);
		return a[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter Elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//int a[] = { 88, 44, 66, 99, 33, 77, 22, 11, 55 };
		System.out.println("Second Smallest: " + getSecondSmallest(arr, n));

	}

}
