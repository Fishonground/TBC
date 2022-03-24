import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAO {

    private final Connection connection;

    public DAO(Connection connection) throws SQLException {
        this.connection = connection;
    }


    public List<God> converter (ResultSet rs) {
        List<God> gods = new ArrayList<>();
        try{
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String culture = rs.getString("culture");
                String power = rs.getString("power");
                String god_of = rs.getString("god_of");
                God god = new God(id,name,culture,power,god_of);
                gods.add(god);
            }
        }catch (SQLException e) {
            System.out.println("Something get wrong with result!");
        }
        return gods;
    }

    public List<God> getAllGods() {
        List<God> gods = new ArrayList<>();
        try (Connection connection =  this.connection){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from gods");
            gods = converter(rs);
        }catch (SQLException e) {
            System.out.println("Something get wrong with SQL!");
        }
        return gods;
    }

    public List<God> getGodByName(String name) {
        List<God> gods = new ArrayList<>();
        try (Connection connection =  this.connection){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from gods where name = \'" + name + "\'");
            gods = converter(rs);
        }catch (SQLException e) {
            System.out.println("Something get wrong with SQL!");
        }
        return gods;
    }

    public List<God> getGodsByCulture(String culture) {
        List<God> gods = new ArrayList<>();
        try (Connection connection =  this.connection){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from gods where culture = \'" + culture + "\'");
            gods = converter(rs);
        }catch (SQLException e) {
            System.out.println("Something get wrong with SQL!");
        }
        return gods;
    }
    public List<God> getGodsByGodOf(String god_of) {
        List<God> gods = new ArrayList<>();
        try (Connection connection =  this.connection){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from gods where god_of = \'" + god_of + "\'");
            gods = converter(rs);
        }catch (SQLException e) {
            System.out.println("Something get wrong with SQL!");
        }
        return gods;
    }

    public List<God> getGodsById(int id) {
        List<God> gods = new ArrayList<>();
        try (Connection connection =  this.connection){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from gods where id=" + id);
            gods = converter(rs);
        }catch (SQLException e) {
            System.out.println("Something get wrong with SQL!");
        }
        return gods;
    }

    public List<God> getGodsByNameAndCulture(String name, String culture) {
        List<God> gods = new ArrayList<>();
        try (Connection connection =  this.connection){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from gods where name = \'" + name + "\' and culture = \'" + culture + "\'");
            gods = converter(rs);
        }catch (SQLException e) {
            System.out.println("Something get wrong with SQL!");
        }
        return gods;
    }

    public List<God> getGodsByCultureAndGodOf(String culture,String god_of) {
        List<God> gods = new ArrayList<>();
        try (Connection connection =  this.connection){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from gods where culture=\'" + culture + "\' and god_of = \'" + god_of + "\'");
            gods = converter(rs);
        }catch (SQLException e) {
            System.out.println("Something get wrong with SQL!");
        }
        return gods;
    }
}
