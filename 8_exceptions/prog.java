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
            Son s1 = new Son(90, 70); 
            Son s2 = new Son(-90, 70);  
        } catch (AgeUnderFlowError e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
