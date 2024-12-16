class AgeUnderFlowError extends Exception {
    public AgeUnderFlowError(String s) {
        super(s);
    }
}

class Father {
    int age;

    public Father(int age) throws AgeUnderFlowError {
        if (age < 0) {
            throw new AgeUnderFlowError("Father's age is less than zero");
        }
        this.age = age;
    }
}

class Son extends Father {
    int s_age;

    public Son(int f_age, int s_age) throws AgeUnderFlowError {
        super(f_age);

        if (s_age >= f_age) {
            throw new AgeUnderFlowError("Father's age is less than or equal to son's age");
        } else {
            this.s_age = s_age;
            System.out.println("Program successfully executed");
        }
    }
}

public class prog {
    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);

            System.out.print("Enter father's age for first son: ");
            int f_age1 = scanner.nextInt();
            System.out.print("Enter son's age for first son: ");
            int s_age1 = scanner.nextInt();
            Son s1 = new Son(f_age1, s_age1);

            System.out.print("Enter father's age for second son: ");
            int f_age2 = scanner.nextInt();
            System.out.print("Enter son's age for second son: ");
            int s_age2 = scanner.nextInt();
            Son s2 = new Son(f_age2, s_age2);

            scanner.close();
        } catch (AgeUnderFlowError e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
