public class ExceptionDemo5 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 0;
        try {
            int result = num1 % num2;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
