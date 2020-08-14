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
        } finally {
            System.out.println("All goes wrong or good? but it's final");
        }
        System.out.println(value);

        String [] belarusinStudents = {"Kirill", "Ivan", "Petr", "Pablo"};
        for (String student: belarusinStudents) {
            if (student == "Pablo") {
                throw new IllegalArgumentException("None belarusian student");
            }
        }
    }
}
