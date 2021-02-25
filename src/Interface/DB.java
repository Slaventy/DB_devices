package Interface;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * БД с записями Note
 * */
public class DB implements Serializable {
    private final String[] titles = {"\tШкаф", "\tШифр прибора", "\tНаименование прибора",
            "\tНомер ящика", "\tВедущий конструктор", "\tПримечание"};    //заголовок

    private final ArrayList<Note> db;  //база записей

    public DB(){
        db = new ArrayList<>();
    }

    public String[] getTitles(){
        return titles;
    }

    //получить список
    public ArrayList<Note> getDB(){
        return db;
    }

    //добавить запись
    public void addNoteInDB(Note note){
        db.add(note);
    }

}
