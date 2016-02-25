package StringCalculator.main;

public class DelimitersNormalizer {

    private static final String[] DEFAULT_DELIMITERS = {",", "\n"};

    public String normalizeDelimiters(String numbers, String normalizerDelimiter) {
        String normalizedNumbers = numbers;

        for (String delimiter : DEFAULT_DELIMITERS) {
            normalizedNumbers = normalizedNumbers.replace(delimiter, normalizerDelimiter);
        }

        return normalizedNumbers;
    }
}
