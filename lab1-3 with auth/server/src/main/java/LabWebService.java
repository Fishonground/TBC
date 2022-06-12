import exceptions.EmptyArgException;
import exceptions.MySQLException;
import exceptions.faults.EmptyArgFault;
import exceptions.faults.SQLFault;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@WebService(targetNamespace = "http://server/",serviceName = "GodService")
public class LabWebService {


    @Resource
    WebServiceContext webServiceContext;



    @WebMethod(operationName = "getAllGods")
    public List<God> getAllGods() throws MySQLException{
        try {
            return (new DAO()).getAllGods();
        } catch (SQLException e) {
            e.printStackTrace();
            SQLFault fault = new SQLFault();
            throw new MySQLException(e.getMessage(), fault, e);
        }
        //DAO dao = new DAO();
        //List<God> gods = dao.getAllGods();
        //return gods;
    }
    @WebMethod(operationName = "getGodByName")
    public List<God> getGodByName(@WebParam(name = "name") String name) throws MySQLException{
        try {
            return (new DAO()).getGodByName(name);
        } catch (SQLException e) {
            e.printStackTrace();
            SQLFault fault = new SQLFault();
            throw new MySQLException(e.getMessage(), fault, e);
        }
        //DAO dao = new DAO();
        //List<God> gods = dao.getGodByName(name);
        //return gods;
    }
    @WebMethod(operationName = "getGodsByCulture")
    public List<God> getGodsByCulture(@WebParam(name = "culture") String culture) throws MySQLException{
        try {
            return (new DAO()).getGodsByCulture(culture);
        } catch (SQLException e) {
            e.printStackTrace();
            SQLFault fault = new SQLFault();
            throw new MySQLException(e.getMessage(), fault, e);
        }
        //DAO dao = new DAO();
        //List<God> gods = dao.getGodsByCulture(culture);
        //return gods;
    }
    @WebMethod(operationName = "getGodsByGodOf")
    public List<God> getGodsByGodOf(@WebParam(name = "god_of") String god_of) throws MySQLException{
        try {
            return (new DAO()).getGodsByGodOf(god_of);
        } catch (SQLException e) {
            e.printStackTrace();
            SQLFault fault = new SQLFault();
            throw new MySQLException(e.getMessage(), fault, e);
        }

        //DAO dao = new DAO();
        //List<God> gods = dao.getGodsByGodOf(god_of);
        //return gods;
    }
    @WebMethod(operationName = "getGodsById")
    public List<God> getGodsById(@WebParam(name = "id") int id) throws MySQLException{
        try {
            return (new DAO()).getGodsById(id);
        } catch (SQLException e) {
            e.printStackTrace();
            SQLFault fault = new SQLFault();
            throw new MySQLException(e.getMessage(), fault, e);
        }

        //DAO dao = new DAO();
        //List<God> gods = dao.getGodsById(id);
        //return gods;
    }
    @WebMethod(operationName = "getGodsByNameAndCulture")
    public List<God> getGodsByNameAndCulture(@WebParam(name = "name") String name, @WebParam(name = "culture") String culture) throws MySQLException{
        try {
            return (new DAO()).getGodsByNameAndCulture(name, culture);
        } catch (SQLException e) {
            e.printStackTrace();
            SQLFault fault = new SQLFault();
            throw new MySQLException(e.getMessage(), fault, e);
        }

        //DAO dao = new DAO();
        //List<God> gods = dao.getGodsByNameAndCulture(name, culture);
        //return gods;
    }
    @WebMethod(operationName = "getGodsByCultureAndGodOf")
    public List<God> getGodsByCultureAndGodOf(@WebParam(name = "culture") String culture, @WebParam(name = "god_of") String god_of) throws MySQLException{
        try {
            return (new DAO()).getGodsByCultureAndGodOf(culture, god_of);
        } catch (SQLException e) {
            e.printStackTrace();
            SQLFault fault = new SQLFault();
            throw new MySQLException(e.getMessage(), fault, e);
        }

        //DAO dao = new DAO();
        //List<God> gods = dao.getGodsByCultureAndGodOf(culture, god_of);
        //return gods;
    }

    //Lab 2 starts here

    @WebMethod(operationName = "createNewGod")
    public List<God> createNewGod(@WebParam(name = "id") int id, @WebParam(name = "name") String name,
                                              @WebParam(name = "culture") String culture,
                            @WebParam(name = "power") String power,
                            @WebParam(name = "god_of") String god_of) throws EmptyArgException, MySQLException{
        DAO dao = new DAO();
        if (name == null || name.equals("")) {
            EmptyArgFault fault = new EmptyArgFault("name");
            throw new EmptyArgException(fault);
        }

        if (culture == null || culture.equals("")) {
            EmptyArgFault fault = new EmptyArgFault("culture");
            throw new EmptyArgException(fault);
        }

        if (power == null || power.equals("")) {
            EmptyArgFault fault = new EmptyArgFault("power");
            throw new EmptyArgException(fault);
        }
        if (god_of == null || god_of.equals("")) {
            EmptyArgFault fault = new EmptyArgFault("god_of");
            throw new EmptyArgException(fault);
        }

        God god = new God(id, name, culture, power, god_of);

        try {
            checkAuth();
        } catch (Exception e){
            EmptyArgFault fault = new EmptyArgFault("wrong auth");
            throw new EmptyArgException(fault);
        }


        try {
            return (new DAO()).createNewGod(god);
            //return dao.createNewGod(god);
        } catch (SQLException e) {
            e.printStackTrace();
            SQLFault fault = new SQLFault();
            throw new MySQLException(e.getMessage(), fault, e);
        }
        //god = dao.createNewGod(god);
        //return god;
    }

    @WebMethod(operationName = "deleteGod")
    public String deleteGod(@WebParam(name = "id") int id) throws EmptyArgException, MySQLException{
        DAO dao = new DAO();
        if ((id < 0) || (id == 0) )  {
            EmptyArgFault fault = new EmptyArgFault("id");
            throw new EmptyArgException(fault);
        }


        try {
            checkAuth();
        } catch (Exception e){
            EmptyArgFault fault = new EmptyArgFault("wrong auth");
            throw new EmptyArgException(fault);
        }

        try {
            return dao.deleteGod(id);
        } catch (SQLException e) {
            e.printStackTrace();
            SQLFault fault = new SQLFault();
            throw new MySQLException(e.getMessage(), fault, e);
        }
        //String result = dao.deleteGod(id);
        //return result;
    }

    @WebMethod(operationName = "updateGod")
    public String updateGod(@WebParam(name = "id") int id, @WebParam(name = "name") String name,
                            @WebParam(name = "culture") String culture,
                            @WebParam(name = "power") String power,
                            @WebParam(name = "god_of") String god_of) throws MySQLException, EmptyArgException {

        DAO dao = new DAO();
        God god = new God(id, name, culture, power, god_of);

        if (getGodsById(id).isEmpty()){
            EmptyArgFault fault = new EmptyArgFault("id");
            throw new EmptyArgException("Id не найден!", fault);
        }
        if (god.getName() == null || god.getName().equals("")) {
            EmptyArgFault fault = new EmptyArgFault("name");
            throw new EmptyArgException("Имя не может быть пустым!", fault);
        }

        if (god.getCulture() == null || god.getCulture().equals("")) {
            EmptyArgFault fault = new EmptyArgFault("culture");
            throw new EmptyArgException(fault);
        }

        if (god.getPower() == null || god.getPower().equals("")) {
            EmptyArgFault fault = new EmptyArgFault("power");
            throw new EmptyArgException(fault);
        }

        if (god.getGod_of() == null || god.getGod_of().equals("")) {
            EmptyArgFault fault = new EmptyArgFault("god_of");
            throw new EmptyArgException(fault);
        }

        try {
            checkAuth();
        } catch (Exception e){
            EmptyArgFault fault = new EmptyArgFault("wrong auth");
            throw new EmptyArgException(fault);
        }

        try {

            return dao.updateGod(god);
        } catch (SQLException e) {
            e.printStackTrace();
            SQLFault fault = new SQLFault();
            
                throw new MySQLException(e.getMessage(), fault, e);

        }
        //String result = dao.updateGod(god);
        //return result;
    }

    @WebMethod(operationName = "getImage")
    public DataHandler getImage() {
        return(new DataHandler(new FileDataSource("C:\\Users\\Stepan\\Downloads\\lab1\\src\\main\\java\\server\\image.jpg")));
    }

    private void checkCreds(String login, String pass) throws Exception{
        if (!login.equals("login") || !pass.equals("password")) {
            throw new Exception("Someone tries to hack us!!");
        }
    }

    private void checkAuth() throws Exception {
        MessageContext messageContext = webServiceContext.getMessageContext();
        Map headers = (Map) messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
        List logins = (List) headers.get("Login");
        List passwords = (List) headers.get("Password");
        String login = "";
        String password = "";
        if ((logins != null) && (passwords != null)) {
            login = logins.get(0).toString();
            password = passwords.get(0).toString();
        }
        checkCreds(login, password);
    }

}
