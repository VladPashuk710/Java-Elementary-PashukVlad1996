package Homework_12;


import sun.security.krb5.Credentials;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDataMapper implements DataMapper {
    List<Credentials> creds = new ArrayList<>();
    public FileDataMapper() {
        BufferedReader br = null;
            try {
            File f = new File("games.txt");
            br = new BufferedReader(new FileReader(f));
            String line;

                    while ((line = br.readLine()) != null) {
                String items[] = line.split(",");
            }
        }   catch (FileNotFoundException e) {
            System.out.println("File not found");
        }   catch (IOException ex) {
            System.out.println(ex.getMessage());
        }   catch (Exception ex) {
            System.out.println("Something went wrong");
        }   finally {
            System.out.println("Finally block");
              if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    public Credentials findUserById(String id) {
            for(Credentials c:creds) {
                if (c.getAuthzData().equals(id))
                    return c;
            }
              throw new NotFoundException("Credentials for id " + id + " was not found");
    }

    @Override
    public Credentials findUserByUsername(String username) {
        return null;
    }

    @Override
    public Credentials findUserByEmail(String email) {
        return null;
    }
}





