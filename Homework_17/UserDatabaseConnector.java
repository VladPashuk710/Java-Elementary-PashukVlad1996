package Homework_17;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class UserDatabaseConnector {

    private String filePath;
    private String dbUrl;
    private String dataSource;

    private static UserDatabaseConnector instance;

    private UserDatabaseConnector() {

        try {
            Properties props = new Properties();
            props.load(new FileReader(new File("src/resources/data.properties")));
            filePath = props.getProperty("filePath");
            dbUrl = props.getProperty("dbUrl");
            dataSource = props.getProperty("dataSource");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static UserDatabaseConnector getInstance() {
        if(instance == null)
            instance = new UserDatabaseConnector();
        return instance;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getDataSource() {
        return dataSource;
    }

}
