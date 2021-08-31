package algoPractice;

public class BinarySearchAlgo {

	public static boolean isPresentRecursive(int array[], int x) {
		return binarySearchRecursiveAlgorithm(array, x, 0, array.length - 1);
	}

	public static boolean isPresentIterative(int array[], int x) {
		return binarySearchIterativeAlgorithm(array, x);
	}

	private static boolean binarySearchRecursiveAlgorithm(int array[], int x, int left, int right) {
		if (left > right) {
			return false;
		}

		int midpoint = left + (right - left) / 2;
		if (array[midpoint] == x) {
			return true;
		} else if (x < array[midpoint]) {
			return binarySearchRecursiveAlgorithm(array, x, left, midpoint - 1);
		} else {
			return binarySearchRecursiveAlgorithm(array, x, midpoint + 1, right);
		}

	}

	private static boolean binarySearchIterativeAlgorithm(int array[], int x) {
		int left = 0;
		int right = array.length - 1;
		while (left <= right) {
			int midpoint = left + (right - left) / 2;
			if (array[midpoint] == x) {
				return true;
			} else if (x < array[midpoint]) {
				right = midpoint - 1;
			} else {
				left = midpoint + 1;
			}
		}
		return false;
	}
}
