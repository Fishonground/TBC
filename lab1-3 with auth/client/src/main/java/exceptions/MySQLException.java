package server.exceptions;

import javax.xml.ws.WebFault;

import server.exceptions.faults.SQLFault;

@WebFault(faultBean = "server.exceptions.faults.SQLFault")
public class MySQLException extends Exception {

    private final SQLFault fault;

    public MySQLException(SQLFault fault) {
        super("Something went wrong with SQL!");
        this.fault = fault;
    }

    public MySQLException(String message, SQLFault fault) {
        super(message);
        this.fault = fault;
    }

    public MySQLException(String message, SQLFault fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public SQLFault getFaultInfo() {
        return fault;
    }

}