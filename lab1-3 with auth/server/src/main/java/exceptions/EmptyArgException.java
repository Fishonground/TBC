package exceptions;

import javax.xml.ws.WebFault;

import exceptions.faults.EmptyArgFault;

@WebFault(faultBean = "server.exceptions.faults.EmptyArgFault")
public class EmptyArgException extends Exception {

    private final EmptyArgFault fault;

    public EmptyArgException(EmptyArgFault fault) {
        super("Empty argument are not allowed!");
        this.fault = fault;
    }

    public EmptyArgException(String message, EmptyArgFault fault) {
        super(message);
        this.fault = fault;
    }

    public EmptyArgFault getFaultInfo() {
        return fault;
    }

}
