package progQuestions;

import java.util.Arrays;

public class PairOfSumProblem {

	// This is the solution for :
	// finding pair of numbers in a given array which adds up to the given number
	public static void findPairOfSumInArray(int[] array, int number) {
		Arrays.sort(array);
		int left = 0;
		int right = array.length - 1;
		while (left != right) {
			if (array[left] + array[right] == number) {
				System.out.println(array[left] + " " + array[right]);
				left++;
			} else if (array[left] + array[right] < number) {
				++left;
			} else {
				--right;
			}
		}
	}
}
