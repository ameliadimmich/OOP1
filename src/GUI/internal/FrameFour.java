package GUI.internal;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class FrameFour extends Window{
    private JLabel jlabel1;
    private JRadioButton rbtn1;
    private JRadioButton rbtn8;
    private JRadioButton rbtn2;
    private JRadioButton rbtn3;
    private JRadioButton rbtn4;
    private JRadioButton rbtn5;
    private JRadioButton rbtn6;
    private JRadioButton rbtn7;
    private JRadioButton rbtn9;
    private JRadioButton rbtn10;
    private JRadioButton rbtn11;
    private JRadioButton rbtn12;
    private JComboBox combobox;
    private JButton backbtn;
    private JButton clearbtn;
    private JButton selectbtn;
    private JLabel jlabel2;
    private JLabel jlabel3;
    private JLabel jlabel4;
    private JPanel mainPanel;
    private JTable table;
    private JPanel pTable;
    private JScrollPane spTable;
    DefaultTableModel model;
    String[] header = {"Type","Pattern","Color"};

    public FrameFour() {
        setContentPane(mainPanel);
        bindModel();
        GetDataFromDB();
        setResizable(false);
        setVisible(true);


        ButtonGroup group1 = new ButtonGroup();
        group1.add(rbtn1);
        group1.add(rbtn2);
        group1.add(rbtn3);
        group1.add(rbtn4);
        group1.add(rbtn5);
        group1.add(rbtn6);
        group1.add(rbtn7);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(rbtn8);
        group2.add(rbtn9);
        group2.add(rbtn10);
        group2.add(rbtn11);
        group2.add(rbtn12);


        backbtn.setBorderPainted(false);
        clearbtn.setBorderPainted(false);
        selectbtn.setBorderPainted(false);
        selectbtn.setBounds(10,40,50,20);

        clearbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                group1.clearSelection();
                group2.clearSelection();
                combobox.setSelectedIndex(0);
            }
        });


        backbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == backbtn){
                    new FrameTwo();
                    dispose();
                }
            }
        });


        selectbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(group1.getSelection() != null && group2.getSelection() != null && combobox.getSelectedItem() != "select"){
                    setPattern();
                    setType();
                    setColour();
                    addShoe(Type, Colour, Pattern);
                    new FrameSuccess2();
                }
                else{
                    new FrameError();
                }
            }
        });

    }

    public int Pattern;
    public int Type;
    public int Colour;

    private void setType(){
        if(rbtn1.isSelected()){
            Type = 1;
        }
        if(rbtn2.isSelected()){
            Type = 2;
        }
        if(rbtn3.isSelected()){
            Type = 3;
        }
        if(rbtn4.isSelected()){
            Type = 4;
        }
        if(rbtn5.isSelected()){
            Type = 5;
        }
        if(rbtn6.isSelected()){
            Type = 6;
        }
        if(rbtn7.isSelected()){
            Type = 7;
        }
    }

    private void setPattern() {
        if(rbtn8.isSelected()){
            Pattern = 1;
        }
        if(rbtn9.isSelected()){
            Pattern = 2;
        }
        if(rbtn10.isSelected()){
            Pattern = 3;
        }
        if(rbtn11.isSelected()){
            Pattern = 4;
        }
        if(rbtn12.isSelected()){
            Pattern = 5;
        }
    }

    private void setColour() {
        for (int i = 1; i < 14; i++) {
            if (combobox.getSelectedIndex() == i) {
                Colour = i;
            }
        }
    }

    private void addShoe(int Type, int Colour, int Pattern){
        Shoe shoe = null;
        ConnectionSettings settings = new ConnectionSettings();
        try{
            Connection conn= DriverManager.getConnection(settings.url,settings.user,settings.pwd);
            Statement stm= conn.createStatement();
            String sql="INSERT INTO shoestotpc(b_shoeType_ID, b_shoeColour_ID, b_shoePattern_ID)"+"VALUES (?,?,?)";
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setInt(1, Type);
            statement.setInt(2, Colour);
            statement.setInt(3, Pattern);

            int addRows= statement.executeUpdate();
            if(addRows>0    ){
                shoe= new Shoe();
                shoe.shoeType=Type;
                shoe.shoePattern=Pattern;
                shoe.shoeColour=Colour;
            }
            stm.close();
            conn.close();
        }  catch (SQLException throwables) {
            throwables.printStackTrace();
        }



    }

    private void bindModel() {
        model = new DefaultTableModel(0,header.length)
        {
            @Override public Class<?> getColumnClass(int column) {
                return getValueAt(0, column).getClass();
            }
        };
        model.setColumnIdentifiers(header);
        table.setModel(model);

    }
    private void GetDataFromDB() {
        ConnectionSettings settings = new ConnectionSettings();

        try {
            Connection conn = DriverManager.getConnection(settings.url, settings.user, settings.pwd);
            Statement sta = conn.createStatement();
            String sql = "SELECT shoestotpc.b_ID, \n" +
                    "\t\tshoetype.shoeType_name AS 'type',\n" +
                    "\t\tshoecolour.shoeColour_name AS 'colour',\n" +
                    "\t\tshoepattern.shoePattern_name AS 'pattern'\n" +
                    "FROM shoestotpc\n" +
                    "LEFT JOIN shoecolour ON shoestotpc.b_shoeColour_ID = shoecolour.shoeColour_ID\n" +
                    "LEFT JOIN shoetype ON shoestotpc.b_shoeType_ID = shoetype.shoeType_ID\n" +
                    "LEFT JOIN shoepattern ON shoestotpc.b_shoePattern_ID = shoepattern.shoePattern_ID\n";
            ResultSet rsta = sta.executeQuery(sql);

            while (rsta.next()) {
                Object[] row = {
                        rsta.getString("type"),
                        rsta.getString("pattern"),
                        rsta.getString("colour"),
                };
                model.addRow(row);
                //dispose();

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



    public static class Test4 {
        public static void main(String[] args) {
            FrameFour four = new FrameFour();
        }

    }
}
