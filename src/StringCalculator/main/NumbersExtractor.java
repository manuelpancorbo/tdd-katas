package StringCalculator.main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NumbersExtractor {

    private static final String NORMALIZER_DELIMITER = "|";
    private static final String[] DEFAULT_DELIMITERS = {",", "\n"};

    private DelimitersNormalizer delimitersNormalizer = new DelimitersNormalizer();

    public List<Integer> extractNumbers(String numbers) {
        if (numbers.isEmpty()) {
            return Collections.emptyList();
        }

        List<Integer> numbersList = new LinkedList<Integer>();
        String numbersWithNormalizedDelimiter = delimitersNormalizer.normalizeDelimiters(numbers, NORMALIZER_DELIMITER);
        String[] splittedNumbers = numbersWithNormalizedDelimiter.split("[" + NORMALIZER_DELIMITER + "]");

        for (String number : splittedNumbers)  {
            numbersList.add(Integer.valueOf(number));
        }

        return numbersList;
    }

}
