package progQuestions;

public class BasicProblems {

	public static int revrseInteger(int number) {
		int result = 0;
		while (number > 0) {
			result = result * 10;
			result = result + number % 10;
			number = number / 10;
		}

		return result;
	}

	public static String longestSubString(String input) {
		String overAllLongest = "";
		String currentLongest = "";
		for (int slow = 0, fast = 0; fast < input.length(); fast++) {
			if (!currentLongest.contains(String.valueOf(input.charAt(fast)))) {
				currentLongest = currentLongest.concat(String.valueOf(input.charAt(fast)));
			} else {
				currentLongest = "";
				slow++;
				fast = slow;
			}
			if (overAllLongest.length() < currentLongest.length()) {
				overAllLongest = currentLongest;
			}
		}
		return overAllLongest;
	}

	public static int largestPairSum(int[] arr, int n) {
		int j = 0;
		int max = n == 2 ? arr[0] + arr[1] : arr[0];
		for (int i = 0; i < n; i++) {
			int sum = arr[j] + arr[i];
			if (sum > max) {
				max = sum;
				if (arr[j] < arr[i]) {
					j = i;
				}
			}
		}
		return max;
	}
}
