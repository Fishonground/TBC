package server;

import javax.xml.ws.Endpoint;

public class App {
    public static void main(String[] args) {
        String url = "http://localhost:8080/hello";
        Endpoint.publish(url, new LabWebService());
    }
}
