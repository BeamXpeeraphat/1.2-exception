public class ExceptionDemo7 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(-10);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: Sleep duration cannot be negative.");
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted.");
                } catch (Exception e) {
                    System.out.println("An unexpected error occurred: " + e.getMessage());
                }
            }
        });
        t.setName("Test Thread");
        t.start();
    }
}
