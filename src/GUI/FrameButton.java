package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameButton extends JFrame{
    private JPanel mainPanel;
    private JButton btnRed;
    public FrameButton(){
        setTitle("Frame Button");
        setSize(500, 500);
        setVisible(true);
        setLocation(400, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(mainPanel);

        btnRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btnRed) {
                    getContentPane().setBackground(Color.RED);
                }
            }
        });
    }

    public static class Test {
        public static void main(String[] args) {
            FrameButton fb = new FrameButton();
        }

    }
}
