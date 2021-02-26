package Interface;


import GUI.*;

public class Logic {

    private static Logic instance;
    private DB db = new DB();
    PanelFrame panelFrame = new PanelFrame(db);
    MainFrame mainFrame = new MainFrame(panelFrame);

    private Logic(){
//        Note note = new Note();
//        note.setBox_number("1");
//        note.setDevice_code("1A2");
//        db.addNoteInDB(note);
    }

    public static Logic getInstance(){
        if (instance == null){
            instance = new Logic();
        }
        return instance;
    }

    public void saveFile(){
        SaveFrame saveFrame = new SaveFrame(db);
    }

    public void openFile(){
        OpenFrame openFrame = new OpenFrame();
        mainFrame.setPanel(openFrame.getPanelFrame());
    }

    public void addNote(){
        AddNoteFrame addNoteFrame = new AddNoteFrame(db.getDB().get(0));
        db.addNoteInDB(addNoteFrame.getNewNote());
        saveFile();

    }
}
