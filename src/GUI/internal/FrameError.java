package GUI.internal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameError extends JFrame {
    private JPanel mainPanel;
    private JButton okbtn;
    private JLabel jlabel1;

    public FrameError() {
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
        });
    }

    public static class TestError {
        public static void main(String[] args) {
            FrameError error = new FrameError();
        }
    }
}

