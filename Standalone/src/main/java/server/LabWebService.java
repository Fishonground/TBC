package server;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName = "GodService")
public class LabWebService {

    @WebMethod(operationName = "getAllGods")
    public List<God> getAllGods(){
        DAO dao = new DAO();
        List<God> gods = dao.getAllGods();
        return gods;
    }
    @WebMethod(operationName = "getGodByName")
    public List<God> getGodByName(@WebParam(name = "name") String name){
        DAO dao = new DAO();
        List<God> gods = dao.getGodByName(name);
        return gods;
    }
    @WebMethod(operationName = "getGodsByCulture")
    public List<God> getGodsByCulture(@WebParam(name = "culture") String culture){
        DAO dao = new DAO();
        List<God> gods = dao.getGodsByCulture(culture);
        return gods;
    }
    @WebMethod(operationName = "getGodsByGodOf")
    public List<God> getGodsByGodOf(@WebParam(name = "god_of") String god_of){
        DAO dao = new DAO();
        List<God> gods = dao.getGodsByGodOf(god_of);
        return gods;
    }
    @WebMethod(operationName = "getGodsById")
    public List<God> getGodsById(@WebParam(name = "id") int id){
        DAO dao = new DAO();
        List<God> gods = dao.getGodsById(id);
        return gods;
    }
    @WebMethod(operationName = "getGodsByNameAndCulture")
    public List<God> getGodsByNameAndCulture(@WebParam(name = "name") String name, @WebParam(name = "culture") String culture){
        DAO dao = new DAO();
        List<God> gods = dao.getGodsByNameAndCulture(name, culture);
        return gods;
    }
    @WebMethod(operationName = "getGodsByCultureAndGodOf")
    public List<God> getGodsByCultureAndGodOf(@WebParam(name = "culture") String culture, @WebParam(name = "god_of") String god_of){
        DAO dao = new DAO();
        List<God> gods = dao.getGodsByCultureAndGodOf(culture, god_of);
        return gods;
    }
}
