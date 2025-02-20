public class ExceptionDemo3 {
    public static void main(String[] args) {
        String[] messages = new String[3];
        try {
            for (int i = 0; i < 4; i++) {
                messages[i] = "String " + i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an index outside the array bounds.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
