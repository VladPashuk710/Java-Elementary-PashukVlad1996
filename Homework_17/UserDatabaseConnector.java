package Homework_17;

import lecture_23.User;
import lecture_23.UserNotFoundException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDatabaseConnector {

    private static UserDatabaseConnector instance;
    private static final String dbUrl = "jdbc:sqlite:mysb.sdb";

    private UserDatabaseConnector() {
    }

    public static UserDatabaseConnector getInstance() {
        if (instance == null) {
            instance = new UserDatabaseConnector();
        }
        return instance;
    }

    public void insert(User user) throws SQLException {
        String insertQuery = "INSERT INTO users(id, username, email, password) VALUES(?,?,?,?);";

        try (Connection connection = DriverManager.getConnection(dbUrl)) {
            try (PreparedStatement statement = connection.prepareStatement(insertQuery)) {
                statement.setString(1, user.getId());
                statement.setString(2, user.getUsername());
                statement.setString(3, user.getEmail());
                statement.setString(4, user.getPassword());

                statement.execute();
            } catch (SQLException ex) {
                throw new RuntimeException("Insertion failed", ex);
            } finally {
                try {

                    if (connection != null)
                        connection.close();
                } catch (SQLException ex) {
                    throw new RuntimeException("Insertion failed", ex);
                }
            }
        }
    }

    public void update(User user) throws SQLException {
        String updateSql = "UPDATE users SET id = ?, username = ?, email = ?, password = ? WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(dbUrl)) {
            try (PreparedStatement statement = connection.prepareStatement(updateSql)) {
                statement.setString(1, user.getId());
                statement.setString(2, user.getUsername());
                statement.setString(3, user.getEmail());
                statement.setString(4, user.getPassword());
                statement.execute();
            } catch (SQLException ex) {
                throw new RuntimeException("Insertion failed", ex);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Insertion failed", ex);
        }
    }

    public void delete(String id) {
        String deleteSql = "DELETE FROM users WHERE id=? ;";
        try (Connection connection = DriverManager.getConnection(dbUrl)) {

            try (PreparedStatement statement = connection.prepareStatement(deleteSql)) {
                statement.setString(1, id);
                statement.execute();
            } catch (SQLException ex) {
                throw new RuntimeException("Insertion failed", ex);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Insertion failed", ex);
        }
    }

    public User findBy(String param, String value) {
        String selectSql = "SELECT FROM users WHERE id=? ;";
        try (Connection connection = DriverManager.getConnection(dbUrl)) {

            try (PreparedStatement statement = connection.prepareStatement(selectSql)) {
                statement.setString(1, param);
                statement.setString(2, value);
                ResultSet rs = statement.executeQuery("SELECT * FROM users;");
                if (rs.next()) {
                    return new User(rs.getString("id"),
                            rs.getString("userName"),
                            rs.getString("email"),
                            rs.getString("password"));
                } else {
                    throw new UserNotFoundException("User with" + param + "and value" + value + "was not found");
                }

            } catch (SQLException ex) {
                throw new RuntimeException("Insertion failed", ex);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Insertion failed", ex);
        }
    }

    public List<User> getAll() throws SQLException {

        try (Connection connection = DriverManager.getConnection(dbUrl)) {

            try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM users;")) {
                List<User> users = new ArrayList<>();
                ResultSet rs = statement.executeQuery("SELECT * FROM users;");

                while (rs.next()) {
                    users.add(
                            new User(rs.getString("id"),
                                    rs.getString("userName"),
                                    rs.getString("email"),
                                    rs.getString("password")));
                }
                return users;
            } catch (SQLException ex) {
                throw new RuntimeException("Insertion failed", ex);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Insertion failed", ex);
        }
    }
}











