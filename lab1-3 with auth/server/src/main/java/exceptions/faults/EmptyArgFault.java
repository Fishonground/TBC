package exceptions.faults;

public class EmptyArgFault {

    private final static String BASE_MESSAGE = "Argument %s is empty!";

    private String message;

    public EmptyArgFault(String argument) {
        this.message = String.format(BASE_MESSAGE, argument);
    }

    public String getMessage() {
        return message;
    }

}