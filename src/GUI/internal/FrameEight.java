package GUI.internal;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class FrameEight extends Window {
    private JPanel mainPanel;
    private JLabel jlabel1;
    private JButton backbtn;
    private JTable table;
    private JPanel pTable;
    private JScrollPane spTable;
    DefaultTableModel model;
    String[] header = {"Type", "Pattern", "Color", "Weather", "Pair", "Clean"};

    public FrameEight() {
        setContentPane(mainPanel);
        bindModel();
        GetDataFromDB();
        setResizable(false);
        setVisible(true);

        backbtn.setBorderPainted(false);
        backbtn.addActionListener(e -> {
            new FrameFive();
            dispose();
        });


    }

    private void bindModel() {
        model = new DefaultTableModel(0, header.length) {
            @Override
            public Class<?> getColumnClass(int column) {
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
                    "\t\tweather.weather_name AS 'weather',\n" +
                    "\t\ts_pair,\n" +
                    "\t\ts_clean\n" +
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
                        rsta.getString("s_pair"),
                        rsta.getString("s_clean"),
                };
                model.addRow(row);
                //dispose();

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public static class Test8 {
        public static void main(String[] args) {
            FrameEight eight = new FrameEight();
        }

    }
}
