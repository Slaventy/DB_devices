package GUI;

import Interface.Logic;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(JPanel panel){
        //начальные настройки окна
        setTitle("База карточек приборов");
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(10, 10, size.width/2, size.height/5);

        //формирование менюБара
        JMenuBar jMenuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu exit = new JMenu("Exit");
        JMenuItem open = new JMenuItem("Open");
        open.addActionListener(e -> Logic.getInstance().openFile());
        JMenuItem save = new JMenuItem("save");
        save.addActionListener(e -> Logic.getInstance().saveFile());
        JMenuItem addNote = new JMenuItem("addNote");
        addNote.addActionListener(e -> Logic.getInstance().addNote());
        file.add(save);
        file.add(open);
        file.add(addNote);

        jMenuBar.add(file);
        jMenuBar.add(exit);
        this.setJMenuBar(jMenuBar);

        //дополнение панели скролами
        JScrollPane jScrollPane = new JScrollPane(panel);
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.add(jScrollPane);

        //условия выхода и отображения
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    //метод установки новой панели
    public void setPanel(PanelFrame panelFrame){
        getContentPane().removeAll();
        add(panelFrame);
        getContentPane().repaint();
    }

}