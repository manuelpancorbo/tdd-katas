package StringCalculator.main;

import StringCalculator.main.exception.NegativesNotAllowedException;

import java.util.List;

public interface NumbersValidator {

    public List<Integer> validate(List<Integer> numbers) throws NegativesNotAllowedException;
}
