import java.util.ArrayList;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        ArrayList<Integer> arrays = new ArrayList<>();
        try {
            arrays.set(-2, null);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Cannot access or modify this position.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
