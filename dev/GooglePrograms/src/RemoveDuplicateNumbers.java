import java.util.Scanner;

public class RemoveDuplicateNumbers {

	public static void main(String[] args) {

		final int COUNT;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		COUNT = in.nextInt();

		int[] arr = new int[COUNT];

		for (int l = 0; l < COUNT; l++) {

			arr[l] = in.nextInt();
		}

		System.out.println("you entered:");
		for (int l = 0; l < COUNT; l++) {
			System.out.print(arr[l] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = -1;
				}
			}

		}

		System.out.println();
		System.out.println("after removing duplicates");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1)
				System.out.println(arr[i] + " ");
		}
	}

}
