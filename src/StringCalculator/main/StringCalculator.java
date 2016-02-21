package StringCalculator.main;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        int result = 0;
        String[] splittedNumbers = numbers.split(",");

        for (String number : splittedNumbers)  {
            result += Integer.valueOf(number);
        }

        return result;
    }
}
