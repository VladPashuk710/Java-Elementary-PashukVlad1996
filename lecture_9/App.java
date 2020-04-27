package lecture_9;

import lecture_9.proj.sources.CarManager;
import lecture_9.proj.sources.LocalCarManager;
import lecture_9.proj.sources.RemoteCarManager;

public class App {

    public static void main(String[] args) {

        CarManager manager = getManager("local");
        manager.findByBrand("Lexus");
    }
    public static CarManager getManager(String param) {
        return param.equals("local") ? new LocalCarManager() : new RemoteCarManager();
    }
}