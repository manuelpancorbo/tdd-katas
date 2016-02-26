package StringCalculator.main;

import StringCalculator.main.exception.NegativesNotAllowedException;

import java.util.List;

public interface NumbersValidator {

    public void validate(List<Integer> numbers) throws NegativesNotAllowedException;
}
