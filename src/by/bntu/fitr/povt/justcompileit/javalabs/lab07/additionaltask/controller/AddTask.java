package by.bntu.fitr.povt.justcompileit.javalabs.lab07.additionaltask.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab07.util.UserInput;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.additionaltask.model.logic.Calendar;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.additionaltask.model.data.DataStore;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.additionaltask.view.Printer;

public class AddTask {

    private static final DataStore dataStore = new DataStore();

    public static void main(String[] args) {

        dataStore.changeDay(UserInput.inputInt("Input day: "));
        dataStore.changeMonth(UserInput.inputInt("Input month: "));
        dataStore.changeYear(UserInput.inputInt("Input year: "));

        String nextDate = Calendar.nextDay(dataStore);

        Printer.println("Next day : " + nextDate);
    }
}
