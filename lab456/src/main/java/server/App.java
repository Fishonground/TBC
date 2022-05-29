package server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.context.WebApplicationContext;



@SpringBootApplication
public class App {

    public static void main(String[] args) {
        WebApplicationContext ctx = (WebApplicationContext) SpringApplication.run(App.class, args);
    }

}