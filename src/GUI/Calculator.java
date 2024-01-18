package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Window{
    private JPanel mainPanel;
    private JLabel jNum1;
    private JLabel jNum2;
    private JTextField tfNum1;
    private JTextField tfNum2;
    private JButton btnAdd;
    private JLabel jValue;
    private JTextField tfValue;
    private JButton btnClear;

    public Calculator(){
        setContentPane(mainPanel);
        setResizable(false);
        setVisible(true);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number1 = Integer.parseInt(tfNum1.getText());
                int number2 = Integer.parseInt(tfNum2.getText());
                int result = number1 +number2;
                tfValue.setText(String.valueOf((result)));
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfNum1.setText("");
                tfNum2.setText("");
                tfValue.setText("");
            }
        });
    }
}
