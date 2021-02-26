package GUI;

import javax.swing.*;
import java.awt.*;

public class AddNoteFrame extends JFrame {
    public AddNoteFrame(){
        setTitle("Добавление новой записи в базу");
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(10, 10, size.width/2, size.height/5);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
