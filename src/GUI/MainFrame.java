package GUI;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(){
        setTitle("База карточек приборов");
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(10, 10, size.width/2, size.height/2);

        JMenuBar jMenuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu exit = new JMenu("Exit");
        jMenuBar.add(file);
        jMenuBar.add(exit);
        this.setJMenuBar(jMenuBar);

        Scrollbar scrollbar = new Scrollbar();
        this.add(scrollbar);

        PanelFrame panelFrame = new PanelFrame();
        setPanelField(panelFrame);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void setPanelField(JPanel panel){
        this.add(panel);
    }
}