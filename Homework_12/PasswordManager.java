package Homework_12;

import sun.security.krb5.Credentials;

public class PasswordManager {

    public static void main(String[] args) {

        DataMapper mapper = new FileDataMapper();
        try {
            Credentials Hearthstone = mapper.findUserById("Hearthstone");
            Credentials GtaSanAndreas = mapper.findUserById("GtaSanAndreas");
            String username = "Vlad";
            String password = "25011996";

            System.out.println(" Hearthstone creds: " + username + ":" + password);
        }
        catch (NotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
