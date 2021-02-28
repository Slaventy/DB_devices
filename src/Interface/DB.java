package Interface;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * БД с записями Note
 * */
public class DB implements Serializable {
    private final ArrayList<Note> db;  //база записей

    public DB(){
        //создаем список состоящий из записей
        db = new ArrayList<>();
        //в качестве первой записи введем заголовок
        Note noteTitle = new Note();
        noteTitle.setCupboard("Шкаф");
        noteTitle.setDevice_code("Шифр\nприбора"); // шифр прибора
        noteTitle.setDevice_name("Наименование\nприбора"); //Наименование прибора
        noteTitle.setBox_number("Номер\nящика");     //номер ящика
        noteTitle.setLeading_designer_of_the_device("Ведущий\nконструктор"); //ведущий конструктор прибора
        noteTitle.setAnnotation("Примечание");  //примечание
        db.add(noteTitle);
    }


    //получить список с заголовком
    public ArrayList<Note> getDB(){
        return db;
    }

    //получить заголовок
    public Note getTitle(){
        return db.get(0);
    }

    //добавить запись
    public void addNoteInDB(Note note){
        db.add(note);
    }

}
