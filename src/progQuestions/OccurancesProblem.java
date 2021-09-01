package progQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurancesProblem {

	public static Map<String, Long> numberOfWordOccurancesInText(String inputText) {
		Map<String, Long> finalOutput = null;
		List<String> inputList = Arrays.asList(inputText.split(" "));
		finalOutput = inputList.stream().map(letter -> letter.toLowerCase())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				// .limit(2)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
		return finalOutput;
	}

}
