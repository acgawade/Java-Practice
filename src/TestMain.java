import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestMain {

	public static void main(String[] args) {
		// int[] array = { -1, -2, 3, -9, 5, 2, 8, 12, 6, 7 };
		// findPairOfSumInArray(array, 7);
		// int arr[] = { 12, 34, 10, 6, 40 };
		// System.out.println(largestPairSum(arr, arr.length));
		// String input = "abcdhjabkopqmnvwxcz";
		// System.out.println(longestSubString(input));
		// int[] input = { 2, 5, 3, 6 };
		// System.out.println(coinChangeWays(10, input)); // ANS must be 5

		System.out.println(revrseInteger(123));
	}

	private static void findPairOfSumInArray(int[] array, int number) {
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

	private static int largestPairSum(int[] arr, int n) {
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

	private static Map<String, Long> numberOfOccurances(String inputText) {
		Map<String, Long> finalOutput = null;
		List<String> inputList = Arrays.asList(inputText.split(" "));
		finalOutput = inputList.stream().map(letter -> letter.toLowerCase())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				// .limit(2)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
		return finalOutput;
	}

	private static String longestSubString(String input) {
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

	// 10, List.of(2, 5, 3, 6)
	private static int coinChangeWays(int N, int[] coins) {
		int[] numCoins = new int[N + 1];
		numCoins[0] = 1;
		for (int i = 0; i < coins.length; i++) {
			for (int j = coins[i]; j < numCoins.length; j++) {
				numCoins[j] += numCoins[j - coins[i]];
			}
		}
		return numCoins[N];
	}

	public static int revrseInteger(int number) {
		int result = 0;
		while (number > 0) {
			result = result * 10;
			result = result + number % 10;
			number = number / 10;
		}

		return result;
	}
}
