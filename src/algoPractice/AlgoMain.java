package algoPractice;

import java.util.Arrays;

public class AlgoMain {

	public static void main(String[] args) {
		int[] array = { -1, -2, 3, -9, 5, 2, 8, 12, 6, 7 };
		Arrays.sort(array);
		System.out.println(BinarySearchAlgo.isPresentRecursive(array, 7));
		System.out.println(BinarySearchAlgo.isPresentIterative(array, -2));
	}
}
