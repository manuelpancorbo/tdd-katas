package StringCalculator.main;

import StringCalculator.main.exception.NegativesNotAllowedException;

import java.util.LinkedList;
import java.util.List;

public class NegativesNotAllowedValidator implements NumbersValidator {

    @Override
    public void validate(List<Integer> numbers) throws NegativesNotAllowedException {
        List<Integer> negatives = new LinkedList<>();
        for (int number : numbers) {
            if (number < 0) {
                negatives.add(number);
            }
        }

        if (!negatives.isEmpty()) {
            throw new NegativesNotAllowedException(negatives);
        }
    }
}
