package GUI.internal;

import javax.swing.*;
import java.awt.*;

public class FrameLista {
    private JPanel panel1;
    private JPanel panel3;
    private JScrollPane scrollPane;
    private CardLayout layout = new CardLayout();
    private JPanel panel2 = new JPanel(layout);

    {
        scrollPane.setViewportView(panel2);
        panel2.add(panel3,"ok");

    }



}
