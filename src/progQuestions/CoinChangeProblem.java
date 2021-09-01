package progQuestions;

public class CoinChangeProblem {

	// This is the solution for:
	// maximum number of ways a change of given money int N can be made
	// given the number of available denominations int[]coins
	// Sample Input : coinChangeWays(10, input) input={ 2, 5, 3, 6 }
	// Sample Output : 5
	public static int coinChangeWays(int N, int[] coins) {
		int[] numCoins = new int[N + 1];
		numCoins[0] = 1;
		for (int i = 0; i < coins.length; i++) {
			for (int j = coins[i]; j < numCoins.length; j++) {
				numCoins[j] += numCoins[j - coins[i]];
			}
		}
		return numCoins[N];
	}

}
