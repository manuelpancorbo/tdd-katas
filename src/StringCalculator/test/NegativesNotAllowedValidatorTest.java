package StringCalculator.test;

import StringCalculator.main.NegativesNotAllowedValidator;
import StringCalculator.main.NumbersValidator;
import StringCalculator.main.exception.NegativesNotAllowedException;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class NegativesNotAllowedValidatorTest {

    private NumbersValidator numbersValidator = new NegativesNotAllowedValidator();

    @Test(expected = NegativesNotAllowedException.class)
    public void should_throw_an_exception_when_there_is_some_negative_number() throws NegativesNotAllowedException {
        numbersValidator.validate(Arrays.asList(-1,3,-6));
    }

    @Test
    public void should_not_throw_an_exception_when_all_numbers_are_positives() throws NegativesNotAllowedException {
        numbersValidator.validate(Arrays.asList(1,2,3));
    }

}
