package lecture_19;

import java.io.*;
import java.util.Properties;

public class Configuration extends Object {

    private String dbHost = "localhost";
    private String dbPort = "3386";
    private String dbUser = "root";
    private String dbPassword = "rootPassword";
    private Integer numberOfThreads = 10;

    private static Configuration instance;

    private Configuration() {

        try {

            Properties props = new Properties();
            props.load(new FileReader(new File("src\\main\\resources\\configuration.properties")));
            dbHost = props.getProperty("dbHost");
            dbPort = props.getProperty("dbPort");
            dbUser = props.getProperty("dbUser");
            dbPassword = props.getProperty("dbPassword");
            numberOfThreads = Integer.parseInt(props.getProperty("numberOfThreads"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getDbHost() {
        return dbHost;
    }

    public String getDbPort() {
        return dbPort;
    }

    public String getDbUser() {
        return dbUser;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public Integer getNumberOfThreads() {
        return numberOfThreads;
    }

    public static Configuration getInstance() {
        if(instance == null) instance = new Configuration();
        return instance;
    }
}
