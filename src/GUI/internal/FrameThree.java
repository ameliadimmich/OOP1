package GUI.internal;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class FrameThree extends Window{
    private JLabel jlabel1;
    private JLabel jlabel2;
    private JLabel jlabel3;
    private JLabel jlabel4;
    private JRadioButton rbtn1;
    private JRadioButton rbtn8;
    private JComboBox combobox;
    private JRadioButton rbtn2;
    private JRadioButton rbtn9;
    private JRadioButton rbtn3;
    private JRadioButton rbtn10;
    private JRadioButton rbtn4;
    private JRadioButton rbtn5;
    private JRadioButton rbtn6;
    private JRadioButton rbtn7;
    private JRadioButton rbtn11;
    private JRadioButton rbtn12;
    private JRadioButton rbtn13;
    private JButton backbtn;
    private JButton selectbtn;
    private JButton clearbtn;
    private JPanel mainPanel;
    private JLabel jlabel5;
    private JRadioButton rbtn14;
    private JRadioButton rbtn15;
    private JComboBox combobox2;
    private JTable table;
    private JPanel pTable;
    private JScrollPane spTable;
    DefaultTableModel model;
    String[] header = {"Type","Pattern","Color", "Weather"};


    public FrameThree() {

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
        group2.add(rbtn13);



        clearbtn.setBorderPainted(false);
        backbtn.setBorderPainted(false);
        selectbtn.setBorderPainted(false);

        clearbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               group1.clearSelection();
               group2.clearSelection();
               combobox.setSelectedIndex(0);
               combobox2.setSelectedIndex(0);
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
                if(group1.getSelection() != null && group2.getSelection() != null && combobox.getSelectedItem() != "select" && combobox2.getSelectedItem() != "select"){
                    setPattern();
                    setType();
                    setColour();
                    setWeather();
                    addSock(Type, Colour, Pattern, Weather);
                    new FrameSuccess();
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
    public int Weather;


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
    private void setPattern(){
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
        if(rbtn13.isSelected()){
            Pattern = 6;
        }
    }
    private void setColour() {
        for (int i = 1; i < 14; i++) {
            if (combobox.getSelectedIndex() == i) {
                Colour = i;
            }
        }
    }


    private void setWeather(){
        for (int i = 1; i < 5; i++) {
            if (combobox2.getSelectedIndex() == i) {
                Weather = i;
            }
        }
    }


    public Sock sock;

    private void addSock(int Type, int Colour, int Pattern, int Weather){
        Sock sock = null;
        ConnectionSettings settings = new ConnectionSettings();
        try{
            Connection conn= DriverManager.getConnection(settings.url,settings.user,settings.pwd);
            Statement stm= conn.createStatement();
            String sql="INSERT INTO sockstotpc(s_sockType_ID, s_sockColour_ID, s_sockPattern_ID, s_Weather_ID)"+"VALUES (?,?,?,?)";
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setInt(1, Type);
            statement.setInt(2, Colour);
            statement.setInt(3, Pattern);
            statement.setInt(4, Weather);

            int addRows= statement.executeUpdate();
            if(addRows>0    ){
                sock= new Sock();
                sock.sockType=Type;
                sock.sockPattern=Pattern;
                sock.sockColour=Colour;
                sock.Weather=Weather;
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
            String sql = "SELECT sockstotpc.s_ID, \n" +
                    "\t\tsocktype.socktype_name AS 'type', \n" +
                    "\t\tsockcolour.sockColour_name AS 'colour', \n" +
                    "\t\tsockpattern.sockPattern_name AS 'pattern',\n" +
                    "\t\tweather.weather_name AS 'weather'\n" +
                    "FROM sockstotpc \n" +
                    "\tLEFT JOIN sockcolour ON sockstotpc.s_sockColour_ID = sockcolour.sockColour_ID\n" +
                    "\tLEFT JOIN socktype ON sockstotpc.s_sockType_ID = socktype.socktype_ID\n" +
                    "\tLEFT JOIN sockpattern ON sockstotpc.s_sockPattern_ID = sockpattern.sockPattern_ID\n" +
                    "\tLEFT JOIN weather ON sockstotpc.s_weather_ID = weather.weather_ID";
            ResultSet rsta = sta.executeQuery(sql);

            while (rsta.next()) {
                Object[] row = {
                        rsta.getString("type"),
                        rsta.getString("pattern"),
                        rsta.getString("colour"),
                        rsta.getString("weather"),
                };
                model.addRow(row);
                //dispose();

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
        public static class Test3 {
            public static void main(String[] args) {
                FrameThree three = new FrameThree();
            }

        }

    }
