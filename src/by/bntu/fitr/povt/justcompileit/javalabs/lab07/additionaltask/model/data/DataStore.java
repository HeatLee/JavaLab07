package by.bntu.fitr.povt.justcompileit.javalabs.lab07.additionaltask.model.data;

public class DataStore {
    private final int MIN_YEAR = 1;
    private final int MIN_MONTH = 1;
    private final int MAX_MONTH = 12;
    private final int MIN_DAY = 1;

    private int year = 0;
    private int month = 0;
    private int day = 0;

    private boolean isValidMonth(int month) {
        return (month >= this.MIN_MONTH && month <= this.MAX_MONTH);
    }

    private boolean isValidYear(int year) {
        return (year >= MIN_YEAR);
    }

    public int getMaxDayOfTheMonth(int month) {
        int maxDay;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDay = 31;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    maxDay = 29;
                    break;
                } else {
                    maxDay = 28;
                    break;
                }
            default:
                maxDay = 30;
                break;
        }
        return maxDay;
    }

    private boolean isValidDay(int day) {
        int maxDay = getMaxDayOfTheMonth(this.month);
        return (day >= MIN_DAY && day <= maxDay);
    }

    public void changeMonth(int month) {
        if (isValidMonth(month)) {
            this.month = month;
        }
    }

    public void changeYear(int year) {
        if (isValidYear(year)) {
            this.year = year;
        }
    }

    public void changeDay(int day) {
        if (isValidDay(day)) {
            this.day = day;
        }
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }
}
