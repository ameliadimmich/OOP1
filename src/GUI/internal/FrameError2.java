package GUI.internal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameError2 extends JFrame{
    private JPanel mainPanel;
    private JButton okbtn;

    public FrameError2() {
        setTitle("Sock Sorting App");
        setSize(250, 200);
        setVisible(true);
        setLocation(525, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(mainPanel);

        okbtn.setBorderPainted(false);
        okbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });}


    public static class TestError2 {
        public static void main(String[] args) {
            FrameError2 error2 = new FrameError2();
        }


}}
