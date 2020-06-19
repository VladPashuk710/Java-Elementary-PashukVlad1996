package Homework_17;

import java.io.*;

public class FileUserDataMapper extends AbstractUserDataMapper {

    public FileUserDataMapper(String file) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File(file)));
            String line;
            while ((line = bf.readLine()) != null) {
                String parts[] = line.split(",");
                users.add(new User(parts[0], parts[1], parts[2], parts[3]));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File with users failed to parse");

        } catch (IOException ex) {
            return;
        }

    }

}
