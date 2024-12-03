package Advanced.Swingx;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCalculator {
    private JFrame frame;
    private JTextField textField;
    private JPanel panel;
    private double firstNumber;
    private double secondNumber;
    private String operator;

    public SwingCalculator() {
        frame = new JFrame("Calculator");
        textField = new JTextField();
        panel = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(new BorderLayout());

        textField.setFont(new Font("Arial", Font.BOLD, 24));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);

        panel.setLayout(new GridLayout(5, 4, 10, 10));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 24));
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        frame.add(textField, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.charAt(0) == '.') {
                textField.setText(textField.getText() + command);
            } else if (command.charAt(0) == 'C') {
                textField.setText("");
            } else if (command.charAt(0) == '=') {
                secondNumber = Double.parseDouble(textField.getText());
                switch (operator) {
                    case "+":
                        textField.setText(Double.toString(firstNumber + secondNumber));
                        break;
                    case "-":
                        textField.setText(Double.toString(firstNumber - secondNumber));
                        break;
                    case "*":
                        textField.setText(Double.toString(firstNumber * secondNumber));
                        break;
                    case "/":
                        textField.setText(Double.toString(firstNumber / secondNumber));
                        break;
                }
            } else {
                firstNumber = Double.parseDouble(textField.getText());
                operator = command;
                textField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingCalculator::new);
    }
}