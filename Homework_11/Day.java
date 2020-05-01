package Homework_11;

public enum Day {
    MONDAY(1,8),
    TUESDAY(2,8),
    WEDNESDAY(3,8),
    THURSDAY(4,8),
    FRIDAY(5,6),
    SATURDAY(6,0),
    SUNDAY(7,0);
    public int numberOfDay;
    public int workingHours;

    Day(int numberOfDay, int workingHours) {
        this.numberOfDay = numberOfDay;
        this.workingHours = workingHours;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    public void setNumberOfDay(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
}
