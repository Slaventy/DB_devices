package GUI;

import Interface.DB;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class OpenFrame extends Component {

    private PanelFrame panelFrame;

        public OpenFrame(){
            try {
                InputStream inputStream = new FileInputStream("base.obj");
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                DB db =(DB) objectInputStream.readObject();
                panelFrame = new PanelFrame(db);
                inputStream.close();
                objectInputStream.close();

            }catch (Exception exception){
                exception.printStackTrace();
            }
        }
        public PanelFrame getPanelFrame(){
            return panelFrame;
        }
}
