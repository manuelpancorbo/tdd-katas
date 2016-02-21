package StringCalculator.main;

import java.util.List;

public class StringCalculator {

    private NumbersExtractor numbersExtractor = new NumbersExtractor();

    public int add(String numbers) {
        int result = 0;
        List<Integer> numbersList = numbersExtractor.extractNumbers(numbers);

        for (Integer number : numbersList)  {
            result += number;
        }

        return result;
    }
}
