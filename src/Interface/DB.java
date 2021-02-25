package Interface;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * БД с записями Note
 * */
public class DB implements Serializable {
    private ArrayList<String> title = new ArrayList<String>("\tШкаф", "\tШифр прибора", "\tНаименование прибора",
            "\tНомер ящика", "\tВедущий конструктор", "\tПримечание");    //заголовок
    private ArrayList<Note> db; //база записей

    public DB(){
        String[] text = {};
        title.add(Arrays.toString(text));
    }

    //добавить список
    public ArrayList<Note> getDB(){
        if (db.isEmpty()){
            return new ArrayList<>(10);
        }
        return db;
    }

    //добавить запись
    public void addDB(Note note){
        db.add(note);
    }

}
