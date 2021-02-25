package Interface;

import java.io.Serializable;

/**
 * Класс запись
 * строка базы
 * */

public class Note implements Serializable {
    private String cupboard;   // номер шкафа
    private String device_code; // шифр прибора
    private String device_name; //Наименование прибора
    private String box_number;     //номер ящика
    private String leading_designer_of_the_device; //ведущий конструктор прибора
    private String annotation;  //примечание

    public String getCupboard() {
        return cupboard;
    }

    public void setCupboard(String cupboard) {
        this.cupboard = cupboard;
    }

    public String getDevice_code() {
        return device_code;
    }

    public void setDevice_code(String device_code) {
        this.device_code = device_code;
    }

    public String getDevice_name() {
        return device_name;
    }

    public void setDevice_name(String device_name) {
        this.device_name = device_name;
    }

    public String getBox_number() {
        return box_number;
    }

    public void setBox_number(String box_number) {
        this.box_number = box_number;
    }

    public String getLeading_designer_of_the_device() {
        return leading_designer_of_the_device;
    }

    public void setLeading_designer_of_the_device(String leading_designer_of_the_device) {
        this.leading_designer_of_the_device = leading_designer_of_the_device;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String[] getNotes(){
        return new String[]{
         cupboard,
        device_code,
        device_name,
        box_number,
        leading_designer_of_the_device,
        annotation
        };
    }

}
