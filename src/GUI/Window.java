package GUI;

import javax.swing.*;

public class Window extends JFrame {

    public Window(){
        setTitle("Window");
        setSize(500, 500);
        setLocation(400, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
