package GUI.internal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameTwo extends Window{
    private JButton socksbtn;
    private JButton shoesbtn;
    private JButton backbtn;
    private JPanel mainPanel;
    private JLabel jlabel1;

    public FrameTwo(){
        setContentPane(mainPanel);
        setResizable(false);
        setVisible(true);


        socksbtn.setBorderPainted(false);
        shoesbtn.setBorderPainted(false);
        backbtn.setBorderPainted(false);

        socksbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == socksbtn){
                    new FrameThree();
                    dispose();
                }
            }
        });

        shoesbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == shoesbtn){
                    new FrameFour();
                    dispose();
                }
            }
        });

        backbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == backbtn){
                    new FrameOne();
                    dispose();
                }
            }
        });

    }


    public static class Test2 {
        public static void main(String[] args) {
            FrameTwo two = new FrameTwo();
        }

    }
}
