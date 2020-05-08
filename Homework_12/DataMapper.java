package Homework_12;

import sun.security.krb5.Credentials;

public interface DataMapper {
    Credentials findUserById(String id);

    Credentials findUserByUsername(String username);

    Credentials findUserByEmail(String email);
}