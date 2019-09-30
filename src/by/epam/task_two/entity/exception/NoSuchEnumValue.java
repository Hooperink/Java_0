package by.epam.task_two.entity.exception;

public class NoSuchEnumValue extends Exception {
    public NoSuchEnumValue(){

    }

    public NoSuchEnumValue(String message){
        super(message);
    }

    public NoSuchEnumValue(String message, Throwable cause){
        super(message, cause);
    }

    public NoSuchEnumValue(Throwable cause){
        super(cause);
    }

}
