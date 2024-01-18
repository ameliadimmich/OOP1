package GUI;

import jdk.jfr.SettingControl;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animals extends Window{
    private JPanel mainPanel;
    private JPanel JRadio;
    private JPanel JPicture;
    private JRadioButton rbDog;
    private JRadioButton rbCat;
    private JRadioButton rbPig;
    private JRadioButton rbBird;
    private JLabel lpicture;

        public Animals() {
            super();
            setContentPane(mainPanel);
            rbBird.setSelected(true);
            setVisible(true);

            ActionListener listener = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lpicture.setIcon(new ImageIcon("src/GUI/photos/" + e.getActionCommand() + ".png"));
                }
            };

            rbDog.addActionListener(listener);
            rbCat.addActionListener(listener);
            rbPig.addActionListener(listener);
            rbBird.addActionListener(listener);

        }
    }
