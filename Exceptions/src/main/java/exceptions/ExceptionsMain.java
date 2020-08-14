package exceptions;

public class ExceptionsMain {
    public static void main(String[] args) {
        String [] numbers = {"23", "0", "Y*"};
        int result;
        int value = 0;
        try {
            result = Integer.parseInt(numbers[2]);
            value = 100 / result;
        } catch (NumberFormatException | ArithmeticException e) {
            result = -1;
            System.err.println(e);
        }
        System.out.println(value);
    }
}
