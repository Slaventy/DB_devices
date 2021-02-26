package GUI;

import Interface.DB;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SaveFrame {

    public SaveFrame(DB db){
        try {
            OutputStream outputStream = new FileOutputStream("base.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(db);
            outputStream.flush();
            objectOutputStream.close();
            outputStream.close();

        }catch  (Exception exception){
            exception.printStackTrace();
        }

    }
}
