package StringCalculator.main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NumbersExtractor {

    public List<Integer> extractNumbers(String numbers) {
        if (numbers.isEmpty()) {
            return Collections.emptyList();
        }

        List<Integer> numbersList = new LinkedList<Integer>();
        String[] splittedNumbers = numbers.split(",");

        for (String number : splittedNumbers)  {
            numbersList.add(Integer.valueOf(number));
        }

        return numbersList;
    }

}
