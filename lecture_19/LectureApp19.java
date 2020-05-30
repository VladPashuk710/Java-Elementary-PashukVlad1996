package lecture_19;

import java.io.FileNotFoundException;

public class LectureApp19 {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("dbHost = " + Configuration.getInstance().getDbHost());

        System.out.println("dbPort = " + Configuration.getInstance().getDbPort());

        System.out.println("dbUser = " + Configuration.getInstance().getDbUser());

        System.out.println("dbPassword = " + Configuration.getInstance().getDbPassword());

        System.out.println("numberOfThreads = " + Configuration.getInstance().getNumberOfThreads());
    }
}
