package Homework_17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DatabaseUserDataMapper extends AbstractUserDataMapper{

    public DatabaseUserDataMapper(String dbUrl) {
        try {
            Connection connection = DriverManager.getConnection(dbUrl);
            ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM users");
            while(rs.next()) {
                users.add(
                        new User(rs.getString("id"),
                        rs.getString("userName"),
                        rs.getString("email"),
                        rs.getString("password")
                        ));
            }

            connection.close();
        } catch (Exception ex) {

        }
    }

}
