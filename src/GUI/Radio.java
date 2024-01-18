package GUI;

import GUI.internal.FrameThree;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Radio extends Window {
    private JPanel mainPanel;
    private JButton btnOK;
    private JRadioButton rbSL;
    private JRadioButton rbHL;


    public Radio() {
        super();
        setContentPane(mainPanel);
        rbSL.setVisible(true);
        setVisible(true);

        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = "";
                if(rbSL.isSelected()){
                    msg="Computer Science SL";
                }
                else if(rbHL.isSelected()){
                    msg="Copmuter Science HL";
                }
                JOptionPane.showMessageDialog(Radio.this,msg);
            }
        });
    }

    public static class Test{
        public static void main(String[] args) {
            Radio r = new Radio();
        }
    }
}
