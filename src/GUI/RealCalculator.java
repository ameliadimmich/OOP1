package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RealCalculator extends Window {
    private JPanel mainPanel;
    private JTextField tfResult;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    private JButton btn15, btnPeriod, btn10, btn11, btn12, btn13;
    private JButton btnDelete;
    private JButton btn14;

    private int n2, n1, r, i;
    char op;

    public RealCalculator() {
        setContentPane(mainPanel);
        setResizable(false);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        JButton clicked = (JButton) ae.getSource();
        if (clicked == btn15) {
            r = n1 = n2 = 0;
            tfResult.setText("");
        } else if (clicked == btn14) {
            n2 = Integer.parseInt(tfResult.getText());
            eval();
            tfResult.setText("" + r);
        } else {
            boolean opf = false;
            if (clicked == btn11) {
                op = '+';
                opf = true;
            }
            if (clicked == btn12) {
                op = '-';
                opf = true;
            }
            if (clicked == btn13) {
                op = '*';
                opf = true;
            }
            if (clicked == btn14) {
                op = '/';
                opf = true;
            }

            if (opf == false) {
                for (i = 0; i < 10; i++) {
                    //if (clicked == btn[i]) {
                        String t = tfResult.getText();
                        t += i;
                        tfResult.setText(t);
                    }
                }
          //  } else {
                n1 = Integer.parseInt(tfResult.getText());
                tfResult.setText("");
            }
        }

        int eval ()
        {
            switch (op) {
                case '+':
                    r = n1 + n2;
                    break;
                case '-':
                    r = n1 - n2;
                    break;
                case '*':
                    r = n1 * n2;
                    break;
                case '/':
                    r = n1 / n2;
                    break;

            }
            return 0;
        }
    }
