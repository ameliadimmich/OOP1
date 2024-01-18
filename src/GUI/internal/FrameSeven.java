package GUI.internal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameSeven extends Window{
    private JPanel mainPanel;
    private JLabel jlabel1;
    private JLabel jlabel2;
    private JButton backbtn;
    private JButton wearbtn;

    public FrameSeven(){
        setContentPane(mainPanel);
        setResizable(false);
        setVisible(true);

        jlabel1.setText("<html>YOUR RECOMMENDATION<br/>TODAY IS:<html>");
        backbtn.setBorderPainted(false);
        wearbtn.setBorderPainted(false);

        backbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrameSix();
                dispose();
            }
        });


    }
    public static class Test7 {
        public static void main(String[] args) {
            FrameSeven seven = new FrameSeven();
        }

    }
}
