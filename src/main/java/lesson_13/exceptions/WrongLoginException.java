package lesson_13.exceptions;

public class WrongLoginException extends Exception{

    public String title;

    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String title) {
        super();
        this.title = title;
    }

}
