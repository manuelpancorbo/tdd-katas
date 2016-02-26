package StringCalculator.main;

import StringCalculator.main.exception.NegativesNotAllowedException;
import StringCalculator.main.exception.ValidationException;

import java.util.LinkedList;
import java.util.List;

public class StringCalculator {

    private NumbersExtractor numbersExtractor = new NumbersExtractor();

    public int add(String numbers) throws ValidationException {
        int result = 0;
        List<Integer> numbersList = numbersExtractor.extractNumbers(numbers);
        validateThatNumbersAreNotNegatives(numbersList);

        for (Integer number : numbersList)  {
            result += number;
        }

        return result;
    }

    public void validateThatNumbersAreNotNegatives(List<Integer> numbersList) throws ValidationException {
        List<Integer> negatives = new LinkedList<>();
        for (int number : numbersList) {
            if (number < 0) {
                negatives.add(number);
            }
        }

        if (!negatives.isEmpty()) {
            throw new NegativesNotAllowedException(negatives);
        }

    }
}
