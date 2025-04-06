import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;

public class package2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        JTextField field1 = new JTextField(10);
        JTextField field2 = new JTextField(10);
        JButton addButton = new JButton("Add");
        JLabel resultLabel = new JLabel("Result: ");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Number 1:"));
        panel.add(field1);
        panel.add(new JLabel("Number 2:"));
        panel.add(field2);
        panel.add(addButton);
        panel.add(resultLabel);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BigDecimal num1 = new BigDecimal(field1.getText());
                BigDecimal num2 = new BigDecimal(field2.getText());
                BigDecimal result = num1.add(num2);
                resultLabel.setText("Result: " + result.toString());
            }
        });

        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
