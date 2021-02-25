package GUI;

import Interface.DB;
import Interface.Note;

import javax.swing.*;
import java.awt.*;

public class PanelFrame extends JPanel {

    public PanelFrame(DB db){
        int row = db.getDB().size();
        int col = db.getTitles().length;



        setLayout(new GridLayout(row+1, col));
        JTextPane jTextPane;
        for (int j = -1; j < row; j++) {
           if (j == -1) {
               for (int i = 0; i < col; i++) {
                   jTextPane = new JTextPane();
                   jTextPane.setText(db.getTitles()[i]);
                   add(jTextPane);
               }
           }else {
               Note note = db.getDB().get(j);
               for (int i = 0; i < col; i++) {
                   jTextPane = new JTextPane();
                   jTextPane.setText(note.getNotes()[i]);
                   add(jTextPane);
               }
           }
        }
    }
}
