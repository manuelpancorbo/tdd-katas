package StringCalculator.main;

import StringCalculator.main.exception.NegativesNotAllowedException;

import java.util.List;
import java.util.stream.Stream;

public class GreaterThanValidator implements NumbersValidator {

    private int limit;

    public GreaterThanValidator(int limit) {
        this.limit = limit;
    }

    @Override
    public List<Integer> validate(List<Integer> numbers) throws NegativesNotAllowedException {
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > this.limit) {
                numbers.remove(i);
            }
        }
        return numbers;
    }
}
