package StringCalculator.test;

import StringCalculator.main.StringCalculator;
import StringCalculator.main.exception.NegativesNotAllowedException;
import StringCalculator.main.exception.ValidationException;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void should_return_zero_when_input_is_empty() throws ValidationException {
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void should_return_one_number_when_input_has_only_one_number() throws ValidationException {
        assertEquals(3, stringCalculator.add("3"));
    }

    @Test
    public void should_return_sum_when_input_has_a_couple_of_numbers() throws ValidationException {
        assertEquals(5, stringCalculator.add("3,2"));
    }

    @Test
    public void should_return_sum_ignoring_numbers_greater_than_one_thousand() throws ValidationException {
        assertEquals(2, stringCalculator.add("2,1001"));
    }

}
