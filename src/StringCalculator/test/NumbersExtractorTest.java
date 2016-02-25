package StringCalculator.test;

import StringCalculator.main.NumbersExtractor;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class NumbersExtractorTest {

    private NumbersExtractor numbersExtractor = new NumbersExtractor();

    @Test
    public void should_return_empty_list_when_input_is_empty() {
        List<Object> expected = Collections.emptyList();
        List<Integer> actual = numbersExtractor.extractNumbers("");
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_list_with_numbers_when_input_has_numbers_separated_by_commas() {
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> actual = numbersExtractor.extractNumbers("1,2,3");
        assertEquals(expected, actual);
    }

    @Test
    public void should_return_list_with_numbers_when_input_has_numbers_separated_by_commas_and_eols() {
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> actual = numbersExtractor.extractNumbers("1,2\n3");
    }

}
