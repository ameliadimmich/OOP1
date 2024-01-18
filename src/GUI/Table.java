package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Table extends Window{
    private JPanel mainPanel;
    private JScrollPane sTable;
    private JTable tData;
    String[] header = {"Name", "Surname"};

    public Table(){
        super();
        setContentPane(mainPanel);
        setVisible(true);
        createTable();
    }

    private void createTable(){
        Object[][] data = {{"Jagoda", "Ulatowska"},
                {"Alicja", "Dróżdż"},
                {"Amelia", "Zielińska"}
        };
        tData.setModel(new DefaultTableModel(data, header));
    }


}
