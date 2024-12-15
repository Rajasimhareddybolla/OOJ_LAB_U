import javax.swing.JOptionPane;

public class add {
    public static void main(String[] args) {
        boolean isRun = true;
        JOptionPane.showMessageDialog(null, "Caluclator", "Division by zero", JOptionPane.INFORMATION_MESSAGE);
        while (isRun) {
            String s1 = JOptionPane.showInputDialog("enter a no ");
            String s2 = JOptionPane.showInputDialog("enter second no");
            try {
                int n1 = Integer.parseInt(s1);
                int n2 = Integer.parseInt(s2);
                float result = n1 / (float) n2;
                JOptionPane.showMessageDialog(null, "result :" + result, "Result", JOptionPane.INFORMATION_MESSAGE);
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "cant divide by zero  :", "  Exception ",
                        JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                isRun = false;
                System.out.println("invalid inputs ");
            }
        }

    }
}
