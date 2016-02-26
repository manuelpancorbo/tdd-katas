package StringCalculator.main;

import StringCalculator.main.exception.ValidationException;

import java.util.Arrays;
import java.util.List;

public class StringCalculator {

    private static final int TOP_LIMIT_NUMBER = 1000;

    private NumbersExtractor numbersExtractor;
    private List<NumbersValidator> numbersValidators;

    public StringCalculator() {
        initializeNumbersExtractor();
        initializeNumbersValidators();
    }

    public int add(String numbers) throws ValidationException {
        int result = 0;
        List<Integer> numbersList = numbersExtractor.extractNumbers(numbers);
        numbersList = validateNumbers(numbersList);

        for (Integer number : numbersList)  {
            result += number;
        }

        return result;
    }

    private void initializeNumbersValidators() {
        this.numbersValidators = Arrays.asList(
                new NegativesNotAllowedValidator(),
                new GreaterThanValidator(TOP_LIMIT_NUMBER)
        );
    }

    private void initializeNumbersExtractor() {
        this.numbersExtractor = new NumbersExtractor();
    }

    public List<Integer> validateNumbers(List<Integer> numbers) throws ValidationException {
        List<Integer> validatedNumbers = numbers;
        for (NumbersValidator numbersValidator : this.numbersValidators) {
            validatedNumbers = numbersValidator.validate(validatedNumbers);
        }
        return validatedNumbers;
    }
}
