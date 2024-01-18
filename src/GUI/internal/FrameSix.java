package GUI.internal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameSix extends Window{
    private JRadioButton rbtn1;
    private JRadioButton rbtn2;
    private JComboBox combobox;
    private JRadioButton rbtn3;
    private JRadioButton rbtn4;
    private JRadioButton rbtn5;
    private JRadioButton rbtn6;
    private JButton backbtn;
    private JButton clearbtn;
    private JButton selectbtn;
    private JPanel mainPanel;
    private JLabel jlabel1;
    private JLabel jlabel2;
    private JLabel jlabel3;
    private JLabel jlabel4;
    private JComboBox comboBox1;
    private JComboBox comboBox2;

    public FrameSix(){
        setContentPane(mainPanel);
        setResizable(false);
        setVisible(true);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(rbtn1);
        group1.add(rbtn2);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(rbtn3);
        group2.add(rbtn4);
        group2.add(rbtn5);
        group2.add(rbtn6);

        backbtn.setBorderPainted(false);
        clearbtn.setBorderPainted(false);
        selectbtn.setBorderPainted(false);

        backbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrameFive();
                dispose();
            }
        });

        clearbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                group1.clearSelection();
                group2.clearSelection();
                combobox.setSelectedIndex(0);
            }
        });

        selectbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rbtn1.isSelected() && group2.getSelection() != null && combobox.getSelectedItem() != "select" && comboBox1.getSelectedItem() != "select" && comboBox2.getSelectedItem() != "select"){
                    new FrameSeven();
                    dispose();
                }
                else if(rbtn2.isSelected() && group2.getSelection() != null){
                    new FrameSeven();
                    dispose();}
                else{
                    new FrameError2();
                }
            }
        });
    }

    public static class Test6 {
        public static void main(String[] args) {
            FrameSix six = new FrameSix();
        }

    }}
