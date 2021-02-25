package Interface;


import GUI.MainFrame;
import GUI.PanelFrame;

public class Logic {
    public Logic(){

        DB db = new DB();
        Note note = new Note();
        note.setBox_number("\t1");
        note.setDevice_code("\t1A2");
        db.addNoteInDB(note);

        PanelFrame panelFrame = new PanelFrame(db);
        MainFrame mainFrame = new MainFrame(panelFrame);
    }
}
