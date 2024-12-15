import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidUserException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    InvalidUserException() {
        super();
    }

    InvalidUserException(String msg) {
        super(msg);
    }

    InvalidUserException(Throwable throwable) {
        super(throwable);
    }

    InvalidUserException(Throwable throwable, String msg) {
        super(msg, throwable);
    }
}

public class p5 {
    public static void main(String[] args) {
        System.out.println("Type an integer on the console ");
        try {
            System.out.println("You typed: " + readFromConsole());
        } catch (InvalidUserException ex) {
            System.out.println("Exception is of type: " + ex);
            System.out.println("Original caught exception is of type: " + ex.getCause());
        }
    }

    public static int readFromConsole() {
        Scanner sc = null;
        int i = 0;
        try {
            sc = new Scanner(System.in);
            i = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Wrapping exception and throwing");
            throw new InvalidUserException(ex, "Invalid integer value entered");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sc != null) {
                sc.close();  
            }
        }
        return i;
    }
}
