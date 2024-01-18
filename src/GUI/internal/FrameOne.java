package GUI.internal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameOne extends Window {
    private JButton yesbtn;
    private JButton nobtn;
    private JPanel mainPanel;
    private JLabel jlabel1;
    private JLabel jlabel2;

    public FrameOne(){
        setContentPane(mainPanel);
        setResizable(false);
        setVisible(true);


        yesbtn.setBorderPainted(false);
        nobtn.setBorderPainted(false);

        yesbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == yesbtn){
                    new FrameTwo();
                    dispose();

                }}
        });

        nobtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == nobtn){
                    new FrameFive();
                    dispose();
                }
            }
        });
    }


    public static class Test {
        public static void main(String[] args) {
            FrameOne one = new FrameOne();
        }

    }

}
