package StringCalculator.main;

import StringCalculator.main.exception.NegativesNotAllowedException;
import StringCalculator.main.exception.ValidationException;

import java.util.LinkedList;
import java.util.List;

public class StringCalculator {

    private NumbersExtractor numbersExtractor = new NumbersExtractor();
    private NumbersValidator negativesNotAllowedValidator = new NegativesNotAllowedValidator();

    public int add(String numbers) throws ValidationException {
        int result = 0;
        List<Integer> numbersList = numbersExtractor.extractNumbers(numbers);
        numbersList = validateNumbers(numbersList);

        for (Integer number : numbersList)  {
            result += number;
        }

        return result;
    }

    public List<Integer> validateNumbers(List<Integer> numbers) throws ValidationException {
        List<Integer> validatedNumbers = negativesNotAllowedValidator.validate(numbers);
        return validatedNumbers;
    }
}
