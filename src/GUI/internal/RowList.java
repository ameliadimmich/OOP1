package GUI.internal;

import javax.swing.*;

public class RowList {
    private JPanel content;
    private JButton pairButton;
    private JButton cleanButton;
    private JLabel typeLabel;
    private JLabel patternLabel;
    private JLabel colourLabel;
    private JLabel weatherLabel;

    public JPanel getContent(){
        return content;
    }

    public RowList(SockTwo sock){
        patternLabel.setText(sock.sockPattern);
        colourLabel.setText(sock.sockColour);
        typeLabel.setText(sock.sockType);
        weatherLabel.setText(sock.Weather);
        cleanButton.setText(sock.clean);
        pairButton.setText(sock.pair);

    }
}


