package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreeButtons extends Window{
    private JPanel mainPanel;
    private JButton bOk;
    private JButton bClear;
    private JTextArea textArea;
    private JLabel jName;
    private JLabel jSurname;
    private JTextField tfName;
    private JTextField tfSurname;

    public ThreeButtons() {
        setContentPane(mainPanel);
        setVisible(true);
        bOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tfName.getText();
                String surname = tfSurname.getText();
                textArea.setText("Welcome " +name +" " +surname);
            }
        });
        bClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfName.setText("");
                tfSurname.setText("");
                textArea.setText("");
            }
        });
    }
}
