public class ExceptionDemo1 {
    public static void main(String[] args) {
        String myString = null;
        try {
            int strLength = myString.length();
        } catch (NullPointerException e) {
            System.out.println("Error: String is null, cannot call length.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
