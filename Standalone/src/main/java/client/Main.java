package client;


import server.God;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
            URL url = new URL ("http://desktop-lm8ae2k:8080/j2e-1.0-SNAPSHOT/GodService?wsdl");
            client_gen.GodService godService = new client_gen.GodService(url);
        System.out.println("=== Get all gods ===");
        List<client_gen.God> gods = godService.getLabWebServicePort().getAllGods();
        //System.out.println(gods.get(0).getCulture());
        printer(gods);

        System.out.println("=== Get gods by name ===");
        gods = godService.getLabWebServicePort().getGodByName("Афанасьев");
        //System.out.println(gods.get(0).getCulture());
        printer(gods);

        System.out.println("=== Get gods by culture ===");
        gods = godService.getLabWebServicePort().getGodsByCulture("ВТ");
        //System.out.println(gods.get(0).getCulture());
        printer(gods);

        System.out.println("=== Get gods by god_of ===");
        gods = godService.getLabWebServicePort().getGodsByGodOf("Студентов");
        //System.out.println(gods.get(0).getCulture());
        printer(gods);

        System.out.println("=== Get all gods by id ===");
        gods = godService.getLabWebServicePort().getGodsById(5);
        //System.out.println(gods.get(0).getCulture());
        printer(gods);

        System.out.println("=== Get all gods By Name And Culture ===");
        gods = godService.getLabWebServicePort().getGodsByNameAndCulture("Зевс", "Скандинавия");
        //System.out.println(gods.get(0).getCulture());
        printer(gods);

        System.out.println("=== Get gods By Culture And GodOf ===");
        gods = godService.getLabWebServicePort().getGodsByCultureAndGodOf("Греция","Грома");
        //System.out.println(gods.get(0).getCulture());
        printer(gods);

        }


        public static void printer ( List<client_gen.God> gods){
        for (client_gen.God god : gods) {
            System.out.println("Ancient GOD " + god.getName() + " from " + god.getCulture() + " culture, " +
                    god.getPower() + ". God of " + god.getGodOf());
        }
     }
}
