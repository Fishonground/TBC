package server;


import org.springframework.web.bind.annotation.*;
import server.exceptions.EmptyArgException;
import server.exceptions.MySQLException;
//import server.exceptions.faults.EmptyArgFault;
//import server.exceptions.faults.SQLFault;


import java.sql.SQLException;
import java.util.List;


@RestController
public class  LabWebService {

    @GetMapping(value = "/gods")
    public /*List<God>*/ ListGodsResponse getAllGods() throws MySQLException{
        try {
            return new ListGodsResponse((new DAO()).getAllGods());
        } catch (SQLException e) {
            e.printStackTrace();
            //SQLFault fault = new SQLFault();
            throw new MySQLException(e.getMessage(), e);
        }
        //DAO dao = new DAO();
        //List<God> gods = dao.getAllGods();
        //return gods;
    }
    @GetMapping("/gods/name/{name}")
    public /*List<God>*/ ListGodsResponse getGodByName(@PathVariable(name = "name") String name) throws MySQLException{
        try {
            return new ListGodsResponse((new DAO()).getGodByName(name));
        } catch (SQLException e) {
            e.printStackTrace();
            //SQLFault fault = new SQLFault();
            throw new MySQLException(e.getMessage(), e);
        }
        //DAO dao = new DAO();
        //List<God> gods = dao.getGodByName(name);
        //return gods;
    }
    @GetMapping("/gods/culture/{culture}")
    public /*List<God>*/ ListGodsResponse getGodsByCulture(@PathVariable(name = "culture") String culture) throws MySQLException{
        try {
            return new ListGodsResponse((new DAO()).getGodsByCulture(culture));
        } catch (SQLException e) {
            e.printStackTrace();
            //SQLFault fault = new SQLFault();
            throw new MySQLException(e.getMessage(), e);
        }
        //DAO dao = new DAO();
        //List<God> gods = dao.getGodsByCulture(culture);
        //return gods;
    }
    @GetMapping("/gods/god_of/{god_of}")
    public /*List<God>*/ ListGodsResponse getGodsByGodOf(@PathVariable(name = "god_of") String god_of) throws MySQLException{
        try {
            return new ListGodsResponse((new DAO()).getGodsByGodOf(god_of));
        } catch (SQLException e) {
            e.printStackTrace();
            //SQLFault fault = new SQLFault();
            throw new MySQLException(e.getMessage(), e);
        }

        //DAO dao = new DAO();
        //List<God> gods = dao.getGodsByGodOf(god_of);
        //return gods;
    }
    @GetMapping("/gods/id/{id}")
    public /*List<God>*/ ListGodsResponse getGodsById(@PathVariable(name = "id") int id) throws MySQLException{
        try {
            return new ListGodsResponse((new DAO()).getGodsById(id));
        } catch (SQLException e) {
            e.printStackTrace();
            //SQLFault fault = new SQLFault();
            throw new MySQLException(e.getMessage(), e);
        }

        //DAO dao = new DAO();
        //List<God> gods = dao.getGodsById(id);
        //return gods;
    }
    @GetMapping("/gods/name_culture/{name}/{culture}")
    public /*List<God>*/ ListGodsResponse getGodsByNameAndCulture(@PathVariable(name = "name") String name, @PathVariable(name = "culture") String culture) throws MySQLException{
        try {
            return new ListGodsResponse((new DAO()).getGodsByNameAndCulture(name, culture));
        } catch (SQLException e) {
            e.printStackTrace();
            //SQLFault fault = new SQLFault();
            throw new MySQLException(e.getMessage(), e);
        }

        //DAO dao = new DAO();
        //List<God> gods = dao.getGodsByNameAndCulture(name, culture);
        //return gods;
    }
    @GetMapping("/gods/culture_god_of/{culture}/{god_of}")
    public /*List<God>*/ ListGodsResponse getGodsByCultureAndGodOf(@PathVariable(name = "culture") String culture, @PathVariable(name = "god_of") String god_of) throws MySQLException{
        try {
            return new ListGodsResponse((new DAO()).getGodsByCultureAndGodOf(culture, god_of));
        } catch (SQLException e) {
            e.printStackTrace();
            //SQLFault fault = new SQLFault();
            throw new MySQLException(e.getMessage(), e);
        }

        //DAO dao = new DAO();
        //List<God> gods = dao.getGodsByCultureAndGodOf(culture, god_of);
        //return gods;
    }

    //Lab 2 starts here

    @PostMapping("/gods")
    public ListGodsResponse /*List<God>*/ createNewGod(@RequestBody God god /*int id, @RequestBody String name,
                                              @RequestBody String culture,
                            @RequestBody String power,
                            @RequestBody String god_of*/) throws EmptyArgException, MySQLException{
        DAO dao = new DAO();
        if (god.getName() == null || god.getName().equals("")) {
            //EmptyArgFault fault = new EmptyArgFault("name");
            throw new EmptyArgException();
        }

        if (god.getCulture() == null || god.getCulture().equals("")) {
            //EmptyArgFault fault = new EmptyArgFault("culture");
            throw new EmptyArgException();
        }

        if (god.getPower() == null || god.getPower().equals("")) {
            //EmptyArgFault fault = new EmptyArgFault("power");
            throw new EmptyArgException();
        }
        if (god.getGod_of() == null || god.getGod_of().equals("")) {
            //EmptyArgFault fault = new EmptyArgFault("god_of");
            throw new EmptyArgException();
        }

        //God god = new God(id, name, culture, power, god_of);
        try {
            return new ListGodsResponse((new DAO()).createNewGod(god));
            //return dao.createNewGod(god);
        } catch (SQLException e) {
            e.printStackTrace();
            //SQLFault fault = new SQLFault();
            throw new MySQLException(e.getMessage(), e);
        }
        //god = dao.createNewGod(god);
        //return god;
    }

    @DeleteMapping("/gods/{id}")
    public String deleteGod(@PathVariable(name = "id") int id) throws EmptyArgException, MySQLException{
        DAO dao = new DAO();
        //System.out.println(id);
        if ((id < 0) || (id == 0) )  {
            //EmptyArgFault fault = new EmptyArgFault("id");
            throw new EmptyArgException();
        }
        try {
            return dao.deleteGod(id);
        } catch (SQLException e) {
            e.printStackTrace();
            //SQLFault fault = new SQLFault();
            throw new MySQLException(e.getMessage(), e);
        }
        //String result = dao.deleteGod(id);
        //return result;
    }
    
    /*@PutMapping("/gods/upd/{id}")
    public String updateGod(@PathVariable(name = "id") int id, @RequestBody God god) throws MySQLException, EmptyArgException {
    	System.out.println(god.getName());
    	return "true";
    }*/

    @PutMapping("/gods/upd/{id}")
    public String updateGod(@PathVariable(name = "id") int id, @RequestBody God god /*String name,
                            @RequestBody String culture,
                            @RequestBody String power,
                            @RequestBody String god_of*/) throws MySQLException, EmptyArgException {
    	
    	
        DAO dao = new DAO();
        //God god = new God(id, name, culture, power, god_of);

        if (getGodsById(id).getGod().isEmpty()){
            //EmptyArgFault fault = new EmptyArgFault("id");
            throw new EmptyArgException("Id не найден!");
        }
        if (god.getName() == null || god.getName().equals("")) {
            //EmptyArgFault fault = new EmptyArgFault("name");
            throw new EmptyArgException("Имя не может быть пустым!");
        }

        if (god.getCulture() == null || god.getCulture().equals("")) {
            //EmptyArgFault fault = new EmptyArgFault("culture");
            throw new EmptyArgException();
        }

        if (god.getPower() == null || god.getPower().equals("")) {
            //EmptyArgFault fault = new EmptyArgFault("power");
            throw new EmptyArgException();
        }

        if (god.getGod_of() == null || god.getGod_of().equals("")) {
            //EmptyArgFault fault = new EmptyArgFault("god_of");
            throw new EmptyArgException();
        }

        try {
            return dao.updateGod(god);
        } catch (SQLException e) {
            e.printStackTrace();
            //SQLFault fault = new SQLFault();
            
                throw new MySQLException(e.getMessage(), e);

        }
        //String result = dao.updateGod(god);
        //return result;
    }
    



}
