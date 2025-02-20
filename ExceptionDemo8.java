import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo8 {
    public static void main(String[] args) {
        File f = new File("test.txt");
        try {
            Scanner scn = new Scanner(f);
            while (scn.hasNextLine()) {
                String line = scn.nextLine();
                System.out.println(line);
            }
            scn.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
