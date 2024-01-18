package GUI.internal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameSuccess2 extends JFrame{
    private JButton yesbtn;
    private JPanel mainPanel;
    private JButton nobtn;
    private JLabel jlabel1;
    private JLabel jlabel2;

    public FrameSuccess2(){
        setTitle("Sock Sorting App");
        setSize(500, 200);
        setVisible(true);
        setLocation(400, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(mainPanel);


        nobtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrameFive();
                dispose();
            }
        });

        yesbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrameFour();
                dispose();
            }
        });
    }

    public static class Test10 {
        public static void main(String[] args) {FrameSuccess2 suc = new FrameSuccess2();
        }

    }

}
