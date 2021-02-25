package GUI;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(JPanel panel){
        setTitle("База карточек приборов");
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(10, 10, size.width/2, size.height/2);

        JMenuBar jMenuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu exit = new JMenu("Exit");
        jMenuBar.add(file);
        jMenuBar.add(exit);
        this.setJMenuBar(jMenuBar);

        JScrollPane jScrollPane = new JScrollPane(panel);
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.add(jScrollPane);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

//    public void setPanelField(JPanel panel){
//
//    }
}