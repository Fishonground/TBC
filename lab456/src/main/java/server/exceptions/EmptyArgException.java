package server.exceptions;

//import javax.xml.ws.WebFault;

//@WebFault(faultBean = "server.exceptions.faults.EmptyArgFault")
public class EmptyArgException extends Exception {

    //private final EmptyArgFault fault;

    public EmptyArgException() {
        super("Empty argument are not allowed!");
        //this.fault = fault;
    }

    public EmptyArgException(String message) {
        super(message);
        //this.fault = fault;
    }


}
