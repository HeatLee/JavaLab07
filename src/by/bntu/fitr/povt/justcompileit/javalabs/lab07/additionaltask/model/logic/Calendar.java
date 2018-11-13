package by.bntu.fitr.povt.justcompileit.javalabs.lab07.additionaltask.model.logic;

public class Calendar {

    public static final int AMOUNT_OF_MONTHES = 12;

    public static String nextDay(int day, int month, int year) {

        if (day > 31 || month > 12 || year <= 0 || day <= 0 || month <= 0) {
            return "Incorrect data.";
        }
        if (isLastDay(day, month, year)) {
            day = 1;
            ++month;
        } else {
            ++day;
        }
        if (month == AMOUNT_OF_MONTHES){
            ++year;
            month = 1;
        }

        return day + "." + month + "." + year;
    }


    private static boolean isLastDay(int day, int month, int year) {
        if (year % 4 == 0) {
            if (month == 2 && day == 28) {
                return true;
            }
        } else if (month == 2 && day == 27)  {
                return true;
        }
        if (month % 2 == 0 && day == 31) {
            return true;
        } else {
            return month % 2 != 0 && day == 30;
        }
    }
}


