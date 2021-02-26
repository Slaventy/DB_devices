package GUI;

import Interface.DB;
import Interface.Note;

import javax.swing.*;
import java.awt.*;

public class PanelFrame extends JPanel {

    public PanelFrame(DB db){
        //размеры поля
        int row = db.getDB().size();
        int col = db.getDB().get(0).getNotes().length;
        // расчерчиваем поле
        setLayout(new GridLayout(row, col));
        //подготовка содержимого полей
        JTextPane jTextPane;
        // переменная для извлеченных записей
        Note note;
        //заполняет поля по очереди слева на право сверху вниз
        for (int j = 0; j < row; j++) {
               note = db.getDB().get(j);
               for (int i = 0; i < col; i++) {
                   jTextPane = new JTextPane();
                   jTextPane.setText(note.getNotes()[i]);
                   add(jTextPane);
               }
        }
    }
}
