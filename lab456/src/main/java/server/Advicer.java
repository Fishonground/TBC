package server;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import server.exceptions.EmptyArgException;
import server.exceptions.MySQLException;


@ControllerAdvice
public class Advicer {

    @ExceptionHandler(EmptyArgException.class)
    public ResponseEntity<Object> handleException(EmptyArgException e) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("exception", e.getClass().getSimpleName());
        body.put("message", e.getMessage());

        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(MySQLException.class)
    public ResponseEntity<Object> handleException(MySQLException e) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("exception", e.getClass().getSimpleName());
        body.put("message", e.getMessage());

        return new ResponseEntity<>(body, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}