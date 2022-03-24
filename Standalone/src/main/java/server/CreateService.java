package server;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateService {
    private final Connection connection;

    public CreateService() {
        connection = ConnectionUtils.getConnection();
    }

    public CreateService(DataSource dataSource) throws SQLException {
        this.connection = dataSource.getConnection();
    }

    public God createPerson(God person) throws SQLException {
        //String query = String.format("insert into person (name, surname, patronymic, age) "
        //                + "values ('%s', '%s', '%s', %d)",
        //        person.getName(), person.getSurname(), person.getPatronymic(), person.getAge());

        //if (query.contains(";")) {
        //    throw new SQLException("SQL Injection detected!");
        //}

        Statement statement = connection.createStatement();

        //statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

        try (ResultSet generatedKeys = statement.getGeneratedKeys()) {

            if (generatedKeys.next()) {
                //person.setId((int) generatedKeys.getLong(1));
            } else {
                throw new SQLException("Creating user failed, no ID obtained.");
            }
        }

        return person;
    }

    @Override
    protected void finalize() {
        try {
            connection.close();
        } catch (SQLException e) {
            // log.error("Error during closing of connection!");
            e.printStackTrace();
        }
    }
}
