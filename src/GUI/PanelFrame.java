package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelFrame extends JPanel {

    public PanelFrame(){


        String[] text = {"\tШкаф", "\tШифр прибора", "\tНаименование прибора",
                "\tНомер ящика", "\tВедущий конструктор", "\tПримечание"};
        int row = 30, col = 6;
        setLayout(new GridLayout(row, col));
        JTextPane jTextPane;
        for (int i = 0; i < row*col; i++){
            if (i<=5){
                jTextPane = new JTextPane();
                jTextPane.setText(text[i]);
                add(jTextPane);
            }else {
                jTextPane = new JTextPane();
                jTextPane.setText(String.valueOf(i));
                add(jTextPane);
            }
        }
    }
}
