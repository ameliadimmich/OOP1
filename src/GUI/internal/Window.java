package GUI.internal;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window(){
        setTitle("Window");
        setSize(500, 500);
        setLocation(400, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

       // Toolkit.getDefaultToolkit().getImage(Window.class.getResource("image.png"));

    }

}
