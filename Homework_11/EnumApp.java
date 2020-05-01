package Homework_11;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;

public class EnumApp {
    public static Day d;

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        DayOfWeek today = convertIntToDay(calendar.get(Calendar.WEDNESDAY));
        Object workingHours = new Object();
        System.out.println(d.getNumberOfDay() + "." + d + "-" +d.getWorkingHours());
    }

    private static DayOfWeek convertIntToDay(int i) {
        return null;
    }
}




