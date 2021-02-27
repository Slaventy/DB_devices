package GUI;

import Interface.Logic;
import Interface.Note;

import javax.swing.*;
import java.awt.*;

public class AddNoteFrame extends JFrame {
    private final Note note;
    private final Note newNote = new Note();

    public AddNoteFrame(Note exNote){
        note = exNote;
        setTitle("Добавление новой записи в базу");
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(10, 10, size.width/2, size.height/5);

        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenuFile = new JMenu("File");
        JMenuItem jMenuSave = new JMenuItem("Save");
        JMenuItem jMenuExit = new JMenuItem("Exit");
        jMenuFile.add(jMenuSave);
        jMenuFile.add(jMenuExit);
        jMenuBar.add(jMenuFile);
        setJMenuBar(jMenuBar);



        JTextField cupboardField = new JTextField();
        JTextField device_code = new JTextField();
        JTextField device_name = new JTextField();
        JTextField box_number = new JTextField();
        JTextField leading_designer_of_the_device = new JTextField();
        JTextField annotation = new JTextField();

        setLayout(new GridLayout(2, 6));
        JTextField jTextField;
        for (int i = 0; i < note.getNotes().length; i++){
                jTextField = new JTextField();
                jTextField.setText(note.getNotes()[i]);
                jTextField.setEditable(false);
                add(jTextField);
        }

        add(cupboardField);
        add(device_code);
        add(device_name);
        add(box_number);
        add(leading_designer_of_the_device);
        add(annotation);



        jMenuSave.addActionListener(e -> {
            newNote.setCupboard(cupboardField.getText());
            newNote.setDevice_code(device_code.getText());
            newNote.setDevice_name(device_name.getText());
            newNote.setBox_number(box_number.getText());
            newNote.setLeading_designer_of_the_device(leading_designer_of_the_device.getText());
            newNote.setAnnotation(annotation.getText());
            Logic.getInstance().saveFile(newNote);
            for (String s :
                    newNote.getNotes()) {
                System.out.println(s);
            }
        });


        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public Note getNewNote(){
        return newNote;
    }
}
