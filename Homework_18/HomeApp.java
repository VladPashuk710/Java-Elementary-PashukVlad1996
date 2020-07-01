package Homework_18;

import Homework_17.UserDatabaseConnector;
import lecture_23.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class HomeApp {

    public static void main(String[] args) throws SQLException {

        Optional<User> updatedUser = Optional.ofNullable(new UserDatabaseConnector().getInstance().findBy("id", "123"));
        updatedUser.get().setEmail("pasukvlad0@gmail.com");
        updatedUser.get().setUsername("Vlad");
        updatedUser.get().setPassword("dgdffdg");
        UserDatabaseConnector.getInstance().update(updatedUser.get());

        List<User> users = UserDatabaseConnector.getInstance().getAll();

        users.stream().filter(u -> u.getUsername().equals("pasukvlad0@gmail.com")).findAny().get();

        for (User u : users)

            System.out.println(u);
    }
}


