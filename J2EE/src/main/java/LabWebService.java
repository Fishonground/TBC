
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.sql.DataSource;

@WebService(targetNamespace = "http://server/",serviceName = "GodService")
public class LabWebService {
    @Resource(lookup = "ifmo-ws")
    private DataSource dataSource;

    @WebMethod(operationName = "getAllGods")
    public List<God> getAllGods() {
        try {
        DAO dao = new DAO(getConnection());
        return dao.getAllGods();
        }
        catch (Exception e) {
        }
        List<God> gods = new ArrayList<>();
        return gods;
    }

    @WebMethod(operationName = "getGodByName")
    public List<God> getPersonsByName(@WebParam(name = "Name")
                                                 String name) {
        try {
            DAO dao = new DAO(getConnection());
            return dao.getGodByName(name);
        }
        catch (Exception e) {
        }
        List<God> gods = new ArrayList<>();
        return gods;
    }


    @WebMethod(operationName = "getGodsByCulture")
    public List<God> getGodsByCulture(@WebParam(name = "culture") String culture){
        try {
            DAO dao = new DAO(getConnection());
            return dao.getGodsByCulture(culture);
        }
        catch (Exception e) {
        }
        List<God> gods = new ArrayList<>();
        return gods;
    }
    @WebMethod(operationName = "getGodsByGodOf")
    public List<God> getGodsByGodOf(@WebParam(name = "god_of") String god_of){
        try {
            DAO dao = new DAO(getConnection());
            return dao.getGodsByGodOf(god_of);
        }
        catch (Exception e) {
        }
        List<God> gods = new ArrayList<>();
        return gods;
    }
    @WebMethod(operationName = "getGodsById")
    public List<God> getGodsById(@WebParam(name = "id") int id){
        try {
            DAO dao = new DAO(getConnection());
            return dao.getGodsById(id);
        }
        catch (Exception e) {
        }
        List<God> gods = new ArrayList<>();
        return gods;
    }
    @WebMethod(operationName = "getGodsByNameAndCulture")
    public List<God> getGodsByNameAndCulture(@WebParam(name = "name") String name, @WebParam(name = "culture") String culture){
        try {
            DAO dao = new DAO(getConnection());
            return dao.getGodsByNameAndCulture(name, culture);
        }
        catch (Exception e) {
        }
        List<God> gods = new ArrayList<>();
        return gods;
    }
    @WebMethod(operationName = "getGodsByCultureAndGodOf")
    public List<God> getGodsByCultureAndGodOf(@WebParam(name = "culture") String culture, @WebParam(name = "god_of") String god_of){
        try {
            DAO dao = new DAO(getConnection());
            return dao.getGodsByCultureAndGodOf(culture,god_of);
        }
        catch (Exception e) {
        }
        List<God> gods = new ArrayList<>();
        return gods;
    }




    private Connection getConnection() {
        Connection result = null;
        try {
            result = dataSource.getConnection();
        } catch (SQLException ex) {
            System.out.println("Something went wrong!");
        }
        return result;
    }
}
