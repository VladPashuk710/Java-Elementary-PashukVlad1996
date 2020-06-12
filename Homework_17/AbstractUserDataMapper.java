package Homework_17;

import java.util.ArrayList;
import java.util.List;

abstract public class AbstractUserDataMapper implements UserDataMapper {

    protected List<User> users = new ArrayList<>();

    @Override
    public User findUserByUserName(String username) {
        for(User u:users) {
            if (u.getUsername().equals(username));
            return u;
        }
        throw new RuntimeException("File with users failed to parse");
    }

    @Override
    public User findUserByEmail(String email) {
        for(User u:users) {
            if (u.getEmail().equals(email));
            return u;
        }
        throw new RuntimeException("File with users failed to parse");
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
