package lesson_13.exceptions;

public class WrongPasswordException extends Exception{

    public String title;

    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String title) {
        super();
        this.title = title;
    }
}
