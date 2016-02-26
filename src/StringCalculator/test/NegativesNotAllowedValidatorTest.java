package StringCalculator.test;

import StringCalculator.main.NegativesNotAllowedValidator;
import StringCalculator.main.NumbersValidator;
import StringCalculator.main.exception.NegativesNotAllowedException;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NegativesNotAllowedValidatorTest {

    private static final List<Integer> NUMBER_LIST_WITHOUT_NEGATIVES = new LinkedList<>(Arrays.asList(1, 2, 3));
    private static final List<Integer> NUMBER_LIST_WITH_SOMES_NEGATIVES = new LinkedList<>(Arrays.asList(-1, 3, -6));

    private NumbersValidator numbersValidator = new NegativesNotAllowedValidator();

    @Test(expected = NegativesNotAllowedException.class)
    public void should_throw_an_exception_when_there_is_some_negative_number() throws NegativesNotAllowedException {
        numbersValidator.validate(NUMBER_LIST_WITH_SOMES_NEGATIVES);
    }

    @Test
    public void should_return_the_same_numbers_when_all_of_them_are_positives() throws NegativesNotAllowedException {
        assertEquals(NUMBER_LIST_WITHOUT_NEGATIVES, numbersValidator.validate(NUMBER_LIST_WITHOUT_NEGATIVES));
    }

}
