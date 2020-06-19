package Homework_17;

import lecture_23.User;

import java.sql.SQLException;
import java.util.List;

public class HomeApp {

    public static void main(String[] args) throws SQLException {

        List<User> users = UserDatabaseConnector.getInstance().getAll();
        for(User u:users)
        System.out.println(users);
    }
}

