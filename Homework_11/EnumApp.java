package Homework_11;

import java.time.DayOfWeek;
import java.util.Random;

public class EnumApp {

    public static void main(String[] args) {
        Random r = new Random();
        int todayDay = r.nextInt(8);
        Day today = Day.valueOf(DayOfWeek.of(todayDay).toString());
        System.out.println(today);
        int workingHoursLeft = 8;
        Day days[] = Day.values();
        for (int i = today.getNumberOfDay(); i < 8; i++) {
            workingHoursLeft += days[i - 1].getWorkingHours();
            System.out.println(workingHoursLeft);
        }
    }
}





