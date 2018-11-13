package by.bntu.fitr.povt.justcompileit.javalabs.lab07.additionaltask.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab07.util.UserInput;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.additionaltask.model.logic.Calendar;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.additionaltask.view.Printer;

public class AddTask {

    public static void main(String[] args) {
        int day = UserInput.inputInt("Input day: ");
        int month = UserInput.inputInt("Input month: ");
        int year = UserInput.inputInt("Input year: ");

        String nextDate = Calendar.nextDay(day, month, year);

        Printer.println("Next day : " + nextDate);
    }
}
