package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TableStudent {
    private JPanel mainPanel;
    private JPanel pField;
    private JPanel pButton;
    private JPanel pTable;
    private JLabel lName;
    private JLabel lSurname;
    private JLabel lAge;
    private JTextField tfName;
    private JTextField tfSurname;
    private JTextField tfAge;
    private JButton btnOK;
    private JButton btnClear;
    private JButton btnDelete;
    private JTable tDate;

    private Student student;
    String[] header = {"Name", "Surname", "Age"};
    DefaultTableModel model;


}
