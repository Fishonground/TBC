package server.exceptions;

//import javax.xml.ws.WebFault;


//@WebFault(faultBean = "server.exceptions.faults.SQLFault")
public class MySQLException extends Exception {

    //private final SQLFault fault;

    public MySQLException() {
        super("Something went wrong with SQL!");
        //this.fault = fault;
    }

    public MySQLException(String message) {
        super(message);
        //this.fault = fault;
    }

    public MySQLException(String message, Throwable cause) {
        super(message, cause);
        //this.fault = fault;
    }

    //public SQLFault getFaultInfo() {
    //    return fault;
    //}

}