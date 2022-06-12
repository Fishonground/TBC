package exceptions.faults;

public class SQLFault {

    private final static String MESS = "Something went wrong with SQL!";

    private String message;

    public SQLFault() {
        this.message = MESS;
    }

    public String getMessage() {
        return message;
    }

}