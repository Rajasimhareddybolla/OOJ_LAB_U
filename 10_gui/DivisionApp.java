import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisionApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Division Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4, 2, 10, 10));
        JLabel labelNum1 = new JLabel("Enter number 1:");
        JTextField textNum1 = new JTextField();
        JLabel labelNum2 = new JLabel("Enter number 2:");
        JTextField textNum2 = new JTextField();
        JLabel labelResult = new JLabel("Result:");
        JTextField textResult = new JTextField();
        textResult.setEditable(false);

        JButton buttonDivide = new JButton("Divide");
        frame.add(labelNum1);
        frame.add(textNum1);
        frame.add(labelNum2);
        frame.add(textNum2);
        frame.add(labelResult);
        frame.add(textResult);
        frame.add(new JLabel());
        frame.add(buttonDivide);
        buttonDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(textNum1.getText());
                    int num2 = Integer.parseInt(textNum2.getText());
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }
                    int result = num1 / num2;
                    textResult.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Invalid input! Please enter integers only.",
                            "Number Format Error",
                            JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame,
                            ex.getMessage(),
                            "Arithmetic Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.setVisible(true);
    }
}
