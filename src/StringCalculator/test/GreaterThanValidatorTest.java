package StringCalculator.test;

import StringCalculator.main.GreaterThanValidator;
import StringCalculator.main.NumbersValidator;
import StringCalculator.main.exception.NegativesNotAllowedException;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GreaterThanValidatorTest {

    private static final int LIMIT = 1000;
    public static final List<Integer> NUMBER_LIST_WITH_NUMBERS_GREATER_THAN_ONE_THOUSAND = new LinkedList<>(Arrays.asList(2, 1001));
    public static final List<Integer> NUMBER_LIST_WITHOUT_NUMBERS_GREATER_THAN_ONE_THOUSAND = new LinkedList<>(Arrays.asList(2));

    private NumbersValidator numbersValidator = new GreaterThanValidator(LIMIT);

    @Test
    public void should_return_all_numbers_less_than_limit() throws NegativesNotAllowedException {
        assertEquals(NUMBER_LIST_WITHOUT_NUMBERS_GREATER_THAN_ONE_THOUSAND,
                numbersValidator.validate(NUMBER_LIST_WITH_NUMBERS_GREATER_THAN_ONE_THOUSAND));
    }
}
