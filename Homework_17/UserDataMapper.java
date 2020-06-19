package Homework_17;

import java.util.List;

public interface UserDataMapper {

    User findUserByUserName(String username);

    User findUserByEmail(String email);

    List<User> getAll();
}
