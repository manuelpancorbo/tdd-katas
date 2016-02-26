package StringCalculator.main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DelimitersNormalizer {

    private static final String[] DEFAULT_DELIMITERS = {",", "\n"};
    private static final String DELIMITERS_LINE_START = "//";
    private static final String DELIMITERS_LINE_END = "\n";

    public String normalizeDelimiters(String numbers, String normalizerDelimiter) {
        String normalizedNumbers = numbers;
        List<String> delimiterList = getDelimiters(numbers);
        normalizedNumbers = removeDelimitersLine(normalizedNumbers);

        for (String delimiter : delimiterList) {
            normalizedNumbers = normalizedNumbers.replace(delimiter, normalizerDelimiter);
        }

        return normalizedNumbers;
    }

    private List<String> getDelimiters(String numbers){
        List<String> delimitersList = new LinkedList<>(Arrays.asList(DEFAULT_DELIMITERS));

        if (isThereCustomDelimiter(numbers)) {
            delimitersList.addAll(getCustomDelimiters(numbers));
        }

        return delimitersList;
    }

    private boolean isThereCustomDelimiter(String numbers) {
        return numbers.startsWith(DELIMITERS_LINE_START);
    }

    private List<String> getCustomDelimiters(String numbers) {
        List<String> customDelimiters = new LinkedList<>();
        Pattern pattern = Pattern.compile("\\[(.*?)\\]");
        Matcher matcher = pattern.matcher(numbers);

        while (matcher.find()) {
            customDelimiters.add(matcher.group(1));
        }

        return customDelimiters;
    }

    private String removeDelimitersLine(String numbers) {
        if(!isThereCustomDelimiter(numbers)) {
            return numbers;
        }

        int endOfDelimitersLineIndex = numbers.indexOf(DELIMITERS_LINE_END) + DEFAULT_DELIMITERS.length - 1;
        return numbers.substring(endOfDelimitersLineIndex);
    }

}
