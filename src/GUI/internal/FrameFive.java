package GUI.internal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameFive extends Window{
    private JPanel mainPanel;
    private JLabel jlabel1;
    private JButton recbtn;
    private JButton catbtn;
    private JButton notifbtn;
    private JButton backbtn;

    public FrameFive(){
        setContentPane(mainPanel);
        setResizable(false);
        setVisible(true);


        recbtn.setBorderPainted(false);
        backbtn.setBorderPainted(false);
        catbtn.setBorderPainted(false);
        notifbtn.setBorderPainted(false);

        recbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrameSix();
                dispose();
            }
        });


        backbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrameOne();
                dispose();
            }
        });


        catbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrameEight();
                dispose();
            }
        });


        notifbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrameTen();
                dispose();
            }
        });
    }

    public static class Test5 {
        public static void main(String[] args) {
            FrameFive five = new FrameFive();
        }

    }
}
