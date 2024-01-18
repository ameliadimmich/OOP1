package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameButtons extends JFrame{
    private JButton btnGreen;
    private JButton btnBlue;
    private JButton btnPink;
    private JButton btnGray;
    private JPanel mainPanel;
    private JButton button1;

    public FrameButtons(){
        setTitle("Frame Button");
        setSize(500, 500);
        setVisible(true);
        setLocation(400, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(mainPanel);

        btnGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btnGreen) {
                    getContentPane().setBackground(Color.GREEN);
                }
            }
        });

        btnBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btnBlue) {
                    getContentPane().setBackground(Color.BLUE);
                }
            }
        });

        btnPink.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btnPink) {
                    getContentPane().setBackground(Color.PINK);
                }
            }
        });

        btnGray.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btnGray) {
                    getContentPane().setBackground(Color.DARK_GRAY);
                }
            }
        });
    }
}
