package by.bntu.fitr.povt.justcompileit.javalabs.lab07.additionaltask.model.logic;

import by.bntu.fitr.povt.justcompileit.javalabs.lab07.additionaltask.model.data.DataStore;

public class Calendar {

    public static String nextDay(DataStore dataStore){
        int day = dataStore.getDay();
        int month = dataStore.getMonth();
        int year = dataStore.getYear();

        String answer;

        if (day == 0 || month == 0 || year == 0) {
            answer = "Incorrect data...";
        }else {

            int nextDay = day;
            int nextMonth = month;
            int nextYear = year;

            if (day == dataStore.getMaxDayOfTheMonth(month) && month == 12) {
                nextDay = 1;
                nextMonth = 1;
                ++nextYear;
            } else if (day == dataStore.getMaxDayOfTheMonth(month)) {
                nextDay = 1;
                ++nextMonth;
            } else {
                ++nextDay;
            }
            answer = String.format("%02d.%02d.%d", nextDay, nextMonth, nextYear);
        }

        return answer;
    }
}


