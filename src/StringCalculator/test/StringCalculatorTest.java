package StringCalculator.test;

import StringCalculator.main.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void should_return_zero_when_input_is_empty() {
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void should_return_one_number_when_input_has_only_one_number() {
        assertEquals(3, stringCalculator.add("3"));
    }

    @Test
    public void should_return_sum_when_input_has_a_couple_of_numbers() {
        assertEquals(5, stringCalculator.add("3,2"));
    }

}
