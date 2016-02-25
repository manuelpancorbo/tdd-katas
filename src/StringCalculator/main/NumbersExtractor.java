package StringCalculator.main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NumbersExtractor {

    private static final String NORMALIZED_DELIMITER = "|";
    private static final String[] DEFAULT_DELIMITERS = {",", "\n"};

    public List<Integer> extractNumbers(String numbers) {
        if (numbers.isEmpty()) {
            return Collections.emptyList();
        }

        List<Integer> numbersList = new LinkedList<Integer>();
        String numbersWithNormalizedDelimiter = getNumbersWithNormalizedDelimiter(numbers);
        String[] splittedNumbers = numbersWithNormalizedDelimiter.split("[" + NORMALIZED_DELIMITER + "]");

        for (String number : splittedNumbers)  {
            numbersList.add(Integer.valueOf(number));
        }

        return numbersList;
    }

    private String getNumbersWithNormalizedDelimiter(String numbers) {
        String normalizedInput = numbers;
        for (String delimiter : DEFAULT_DELIMITERS) {
            normalizedInput = normalizedInput.replace(delimiter, NORMALIZED_DELIMITER);
        }
        return normalizedInput;
    }

}
