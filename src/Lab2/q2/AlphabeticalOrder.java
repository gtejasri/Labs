package Lab2.q2;


public class AlphabeticalOrder {
	public static String sortStrings(String[] arr, int total) {
		String temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {

				if (arr[i].compareTo(arr[j]) > 0) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("The names in alphabetical order are: ");
		for (int i = 0; i < total; i++) {
			System.out.println(arr[i]);

		}
		return "nkko";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "Alex", "Chay", "Devil", "Aniee", "Boss" };
		int n = arr.length;
		AlphabeticalOrder.sortStrings(arr, n);

	}

}
