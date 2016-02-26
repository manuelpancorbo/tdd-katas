package StringCalculator.main.exception;

import java.util.List;

public class NegativesNotAllowedException extends ValidationException {

    List<Integer> negatives;

    public NegativesNotAllowedException(List<Integer> negatives) {
        this.negatives = negatives;
    }

    @Override
    public String getMessage() {
        return NegativesNotAllowedException.class.getCanonicalName() +
                " " + negatives.toString();
    }
}
