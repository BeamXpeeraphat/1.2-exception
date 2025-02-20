public class ExceptionDemo2 {
    public static void main(String[] args) {
        Object p = new Person();
        
        try {
            Employee aString = (Employee)p;
        } catch (ClassCastException e) {
            System.out.println("Error: Cannot cast Person to Employee.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

class Employee {

}

class Person {

}
