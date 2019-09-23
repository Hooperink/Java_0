package by.epam.task_one.exception;

public class ArrayIsNullException extends Exception {

    public ArrayIsNullException() {
    }

    public ArrayIsNullException(String message){
        super(message);
    }

    public ArrayIsNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrayIsNullException(Throwable cause) {
        super(cause);
    }
}
