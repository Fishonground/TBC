//import client_gen.*;


import client_gen.LabWebService;
import server.exceptions.EmptyArgException;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static final String ReqURL = "http://localhost:8080/hello?wsdl";

    public static void main(String[] args) throws MalformedURLException {
            URL url = new URL ("http://localhost:8080/hello?wsdl");
        try {
            client_gen.GodService godService = new client_gen.GodService(url);

            //auth adding
            LabWebService labWebService = godService.getLabWebServicePort();
            Map<String, Object> requestContext = ((BindingProvider)labWebService).getRequestContext();
            requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ReqURL);
            Map<String, List<String>> headers = new HashMap<>();
            headers.put("Login", Collections.singletonList("login"));
            headers.put("Password", Collections.singletonList("pass"));
            requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
            //end auth ending

            System.out.println("=== Get all gods ===");
            List<client_gen.God> gods = godService.getLabWebServicePort().getAllGods();
            //System.out.println(gods.get(0).getCulture());
            printer(gods);

            /*System.out.println("=== Get gods by name ===");
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
            gods = godService.getLabWebServicePort().getGodsByCultureAndGodOf("Греция", "Грома");
            //System.out.println(gods.get(0).getCulture());
            printer(gods);*/

            System.out.println("=== Create new god ===");

            try{
                //gods = godService.getLabWebServicePort().createNewGod(10, "ЧТо-нибудь", "Древняя Русь", "Неизвестно", "Ремесел");
                gods = labWebService.createNewGod(10, "ЧТо-нибудь", "Древняя Русь", "Неизвестно", "Ремесел");
                printer(gods);
            }
            catch (Exception e) {
                System.out.println(e);
            }

            System.out.println("=== Check the result ===");
            gods = godService.getLabWebServicePort().getAllGods();
            printer(gods);
            /*try{
            System.out.println("==========GET FILE=============");
            byte[] image = godService.getLabWebServicePort().getImage();
            OutputStream out = new FileOutputStream("test.jpg");
            out.write(image);
            out.flush();
            out.close();
            }
            catch (Exception e) {
                System.out.println("Something went wrong!");
            }*/


//            System.out.println("=== Update the god ===");
//            try{
//                String res = godService.getLabWebServicePort().updateGod(16, "Нечто", "Совсем", "Новое", "Вот так вот");
//                System.out.println(res);
//            }
//            catch (Exception e) {
//                System.out.println(e);
//            }
//            System.out.println("=== Check the result ===");
//            gods = godService.getLabWebServicePort().getAllGods();
//            printer(gods);
//
//
//
//            System.out.println("=== Delete the god ===");
//            try{
//                String res = godService.getLabWebServicePort().deleteGod(15);
//                System.out.println(res);
//            }
//            catch (Exception e) {
//                System.out.println(e);
//            }
//            System.out.println("=== Check the result ===");
//            gods = godService.getLabWebServicePort().getAllGods();
//            printer(gods);
        }
        catch (client_gen.MySQLException e) {
            System.out.println("SQL exception found!");
        }
        }


        public static void printer ( List<client_gen.God> gods){
        for (client_gen.God god : gods) {
            System.out.println("Ancient GOD " + god.getName() + " from " + god.getCulture() + " culture, " +
                    god.getPower() + ". God of " + god.getGodOf());
        }
     }
}
