package StringCalculator.test;


import StringCalculator.main.DelimitersNormalizer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DelimitersNormalizerTest {

    private DelimitersNormalizer delimitersNormalizer = new DelimitersNormalizer();

    @Test
    public void should_replace_commas_and_eols_by_dollar_symbol() {
        assertEquals("1$2$3", delimitersNormalizer.normalizeDelimiters("1,2\n3", "$"));
    }

    @Test
    public void should_replace_numbers_delimiters_by_dollar_symbol() {
        assertEquals("1$2$3$4", delimitersNormalizer.normalizeDelimiters("//*\n1*2,3\n4", "$"));
    }
}
