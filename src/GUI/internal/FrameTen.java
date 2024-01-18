package GUI.internal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameTen extends Window{
    private JPanel mainPanel;
    private JLabel jlabel1;
    private JCheckBox check1;
    private JTextField txtfield1;
    private JLabel jlabel2;
    private JButton selectbtn;
    private JButton clearbtn;
    private JButton backbtn;
    private JTextField txtfield2;
    private JTextField txtfield3;
    private JTextField txtfield4;
    private JTextField txtfield5;
    private JTextField txtfield6;
    private JTextField txtfield7;
    private JTextField txtfield8;
    private JTextField txtfield9;
    private JTextField txtfield10;
    private JTextField txtfield11;
    private JTextField txtfield12;
    private JTextField txtfield13;
    private JTextField txtfield14;
    private JCheckBox check2;
    private JCheckBox check3;
    private JCheckBox check4;
    private JCheckBox check5;
    private JCheckBox check6;
    private JCheckBox check7;
    private JCheckBox check8;
    private JCheckBox check9;
    private JCheckBox check10;
    private JCheckBox check11;
    private JCheckBox check12;
    private JCheckBox check13;
    private JCheckBox check14;

    public FrameTen(){
        setContentPane(mainPanel);
        setResizable(false);
        setVisible(true);

        backbtn.setBorderPainted(false);
        selectbtn.setBorderPainted(false);
        clearbtn.setBorderPainted(false);



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
                txtfield1.setText("");
                txtfield2.setText("");
                txtfield3.setText("");
                txtfield4.setText("");
                txtfield5.setText("");
                txtfield6.setText("");
                txtfield7.setText("");
                txtfield8.setText("");
                txtfield9.setText("");
                txtfield10.setText("");
                txtfield11.setText("");
                txtfield12.setText("");
                txtfield13.setText("");
                txtfield14.setText("");
                check1.setSelected(false);
                check2.setSelected(false);
                check3.setSelected(false);
                check4.setSelected(false);
                check5.setSelected(false);
                check6.setSelected(false);
                check7.setSelected(false);
                check8.setSelected(false);
                check9.setSelected(false);
                check10.setSelected(false);
                check11.setSelected(false);
                check12.setSelected(false);
                check13.setSelected(false);
                check14.setSelected(false);
            }
        });


        selectbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrameFive();
                dispose();
            }
        });
    }



    public static class Test9 {
        public static void main(String[] args) {
            FrameTen ten = new FrameTen();
        }

    }
}

