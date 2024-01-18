package GUI.internal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameSuccess extends JFrame{
    private JPanel mainPanel;
    private JButton nobtn;
    private JLabel jlabel1;
    private JButton yesbtn;
    private JLabel jlabel2;

    public FrameSuccess(){
        setTitle("Sock Sorting App");
        setSize(500, 200);
        setVisible(true);
        setLocation(400, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(mainPanel);

        nobtn.setBorderPainted(false);
        yesbtn.setBorderPainted(false);
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
                new FrameThree();
                dispose();
            }
        });
    }
}
