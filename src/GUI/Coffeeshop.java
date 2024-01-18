package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Coffeeshop extends Window{
    private JPanel mainPanel;
    private JPanel JMenu;
    private JPanel JButtons;
    private JPanel JValues;
    private JCheckBox cbCoffee;
    private JCheckBox cbJuice;
    private JCheckBox cbTea;
    private JCheckBox cbToast;
    private JCheckBox cbCroissant;
    private JCheckBox cbBagels;
    private JButton btnClear;
    private JButton btnEnter;
    private JTextArea textArea1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JRadioButton radioButton5;
    private JRadioButton radioButton6;
    private JRadioButton radioButton7;
    private JRadioButton radioButton8;
    private JRadioButton radioButton9;
    private JRadioButton radioButton10;
    private JRadioButton radioButton11;
    private JRadioButton radioButton12;
    private double sum = 0.0;


    public Coffeeshop(){
        super();
        setContentPane(mainPanel);
        cbCoffee.setSelected(false);
        setVisible(true);

        cbJuice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbJuice.isSelected()){
                    sum = sum + 2.5;
                }
            }
        });

        cbCoffee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbCoffee.isSelected()){
                    sum = sum + 2.0;
                }
            }
        });

        cbTea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbTea.isSelected()){
                    sum = sum + 1.5;
                }
            }
        });

        cbBagels.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbBagels.isSelected()){
                    sum = sum + 4.0;
                }
            }
        });

        cbToast.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbToast.isSelected()){
                    sum = sum + 3.0;
                }
            }
        });

        cbCroissant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (cbCroissant.isSelected()){
                    sum = sum + 3.5;
                }
            }
        });

        btnEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               textArea1.setText("Total: " +sum +"$");
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum = 0.0;
                textArea1.setText("");
                cbCoffee.setSelected(false);
                cbTea.setSelected(false);
                cbJuice.setSelected(false);
                cbCroissant.setSelected(false);
                cbToast.setSelected(false);
                cbBagels.setSelected(false);
            }
        });
    }

}
