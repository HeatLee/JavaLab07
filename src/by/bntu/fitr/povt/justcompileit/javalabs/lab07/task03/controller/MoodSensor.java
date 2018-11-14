package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task03.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task03.view.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task03.model.logic.MoodDetecter;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task03.model.data.DataStore;

public class MoodSensor {

    private static final DataStore dataStore = new DataStore();

    public static void main(String[] args) {

        String face = MoodDetecter.detectMood(dataStore);

        Printer.println("Your mood: ");
        Printer.println(face);
    }
}
