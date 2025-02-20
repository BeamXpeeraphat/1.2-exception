public class ExceptionDemo4 {
    public static void main(String[] args) {
        String notNumber = "H123";
        try {
            int n = Integer.parseInt(notNumber);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input, unable to convert string to number.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
