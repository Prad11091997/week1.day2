package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		int i = arr[0];

		Arrays.sort(arr);

		while (i < arr.length) 
		{
			if (arr[i] - arr[i - 1] == 1) {
			} else {
				System.out.println("Missing number is " + (arr[i - 1] + 1));
			}
			i++;
		}
	}
}