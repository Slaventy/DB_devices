package Interface;


import GUI.*;

import java.io.*;

public class Logic {

    private static Logic instance;
    private DB db = new DB();
    private final PanelFrame panelFrame = new PanelFrame(db);
    private final MainFrame mainFrame = new MainFrame(panelFrame);

    private Logic(){
    }

    public static Logic getInstance(){
        if (instance == null){
            instance = new Logic();
        }
        return instance;
    }

    //добавляет новую запись к DB и сохраняет в файл
    public void saveFile(Note note){
        try {
            OutputStream outputStream = new FileOutputStream("base.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            db.addNoteInDB(note);
            objectOutputStream.writeObject(db);
            outputStream.flush();
            objectOutputStream.close();
            outputStream.close();

        }catch  (Exception exception){
            exception.printStackTrace();
        }
    }

    public void openFile(){
        try {
            InputStream inputStream = new FileInputStream("base.obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            db =(DB) objectInputStream.readObject();
            mainFrame.setPanel(new PanelFrame(db));
            inputStream.close();
            objectInputStream.close();
            mainFrame.setVisible(true);

        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

    public void addNote(){
        new AddNoteFrame(db.getTitle());
    }
}
