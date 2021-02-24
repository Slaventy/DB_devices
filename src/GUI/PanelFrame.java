package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelFrame extends JPanel {

    public PanelFrame(){
        JTextPane jTextPane = new JTextPane();
        jTextPane.setText(
                "|___Шкаф___|___Шифр прибора___|__Наименование прибора__|__Номер ящика__|" +
                        "__Ведущий конструктор__|___Примечание___|");
        setLayout(new BorderLayout());
        add(jTextPane);
    }
}
