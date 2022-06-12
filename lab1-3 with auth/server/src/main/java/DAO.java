import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAO {
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

    public List<God> getAllGods() throws SQLException {
        List<God> gods = new ArrayList<>();
        try (Connection connection =  ConnectionUtils.getConnection()){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from gods");
            gods = converter(rs);
            st.close();
        }catch (SQLException e) {
            System.out.println("Something get wrong with SQL!");
        }
        return gods;
    }

    public List<God> getGodByName(String name) throws SQLException {
        List<God> gods = new ArrayList<>();
        try (Connection connection =  ConnectionUtils.getConnection()){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from gods where name = \'" + name + "\'");
            gods = converter(rs);
            st.close();
        }catch (SQLException e) {
            System.out.println("Something get wrong with SQL!");
        }
        return gods;
    }

    public List<God> getGodsByCulture(String culture) throws SQLException {
        List<God> gods = new ArrayList<>();
        try (Connection connection =  ConnectionUtils.getConnection()){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from gods where culture = \'" + culture + "\'");
            gods = converter(rs);
            st.close();
        }catch (SQLException e) {
            System.out.println("Something get wrong with SQL!");
        }
        return gods;
    }
    public List<God> getGodsByGodOf(String god_of) throws SQLException {
        List<God> gods = new ArrayList<>();
        try (Connection connection =  ConnectionUtils.getConnection()){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from gods where god_of = \'" + god_of + "\'");
            gods = converter(rs);
            st.close();
        }catch (SQLException e) {
            System.out.println("Something get wrong with SQL!");
        }
        return gods;
    }

    public List<God> getGodsById(int id) throws SQLException {
        List<God> gods = new ArrayList<>();
        try (Connection connection =  ConnectionUtils.getConnection()){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from gods where id=" + id);
            gods = converter(rs);
            st.close();
        }catch (SQLException e) {
            System.out.println("Something get wrong with SQL!");
        }
        return gods;
    }

    public List<God> getGodsByNameAndCulture(String name, String culture) throws SQLException {
        List<God> gods = new ArrayList<>();
        //Connection connection =  ConnectionUtils.getConnection()
        try (Connection connection =  ConnectionUtils.getConnection()){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from gods where name = \'" + name + "\' and culture = \'" + culture + "\'");
            gods = converter(rs);
            st.close();
        }catch (SQLException e) {
            System.out.println("Something get wrong with SQL!");
        }
        return gods;
    }

    public List<God> getGodsByCultureAndGodOf(String culture,String god_of) throws SQLException {
        List<God> gods = new ArrayList<>();
        try (Connection connection =  ConnectionUtils.getConnection()){
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from gods where culture=\'" + culture + "\' and god_of = \'" + god_of + "\'");
            gods = converter(rs);
            st.close();
        }catch (SQLException e) {
            System.out.println("Something get wrong with SQL!");
        }
        return gods;
    }


    //Lab 2 starts here


    public List<God> createNewGod(God god) throws SQLException {
        List<God> gods = new ArrayList<>();
        try (Connection connection =  ConnectionUtils.getConnection()){
            String query = String.format("insert into gods (name, culture, power, god_of) "
                            + "values ('%s', '%s', '%s', '%s')",god.getName(), god.getCulture(), god.getPower(), god.getGod_of());

            if (query.contains(";")) {
               throw new SQLException("SQL Injection detected!");
            }
            System.out.println("Начинаю запись");
            Statement st = connection.createStatement();
            st.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

            try (ResultSet generatedKeys = st.getGeneratedKeys()) {

                if (generatedKeys.next()) {
                    god.setId((int) generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Creating user failed, no ID obtained.");
                }
            }
            //st.executeUpdate(query);
            //st.executeQuery("insert into gods (name, culture, power, god_of) values ( \'"
            //        + god.getName() + "\', \'"
            //        + god.getCulture() + "\', \'" + god.getPower() + "\', \'" + god.getGod_of() + "\')");
            System.out.println("Запись завершена");
            //gods = converter(rs);
            gods.add(god);
            st.close();
        }catch (SQLException e) {
            System.out.println(e);
        }

        return gods;
    }

    public String deleteGod(int id) throws SQLException {
        String query = String.format("delete from gods where gods.id = %d",
                id);
        //Connection connection =  ConnectionUtils.getConnection();
        try (Connection connection =  ConnectionUtils.getConnection()){
        Statement st = connection.createStatement();
            System.out.println("Начинаю удаление элемента");
        st.executeUpdate(query);
            System.out.println("Удаление завершено");
        st.close();
        }catch (SQLException e) {
            System.out.println("Something get wrong with SQL!");
        }
        return "Successfully deleting god from panteon!";
    }

    public String updateGod(God god) throws SQLException{
    String query = String.format("update gods set name='%s', culture='%s', power='%s', god_of='%s' "
                    + "where id = %d",
            god.getName(), god.getCulture(), god.getPower(), god.getGod_of(), god.getid());
        //Connection connection =  ConnectionUtils.getConnection();
        try(Connection connection =  ConnectionUtils.getConnection()){

            if (query.contains(";")) {
                throw new SQLException("SQL Injection detected!");
            }

            Statement st = connection.createStatement();
            System.out.println("Начинаю изменение элемента");
            st.executeUpdate(query);
            System.out.println("Изменение завершено");
            st.close();
        }catch (SQLException e) {
            System.out.println("Something get wrong with SQL!");
        }
        return "This god updated successfully!";
    }

}
