package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task03.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task03.view.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task03.model.logic.MoodDetecter;

public class MoodSensor {

    public static void main(String[] args) {

        String face = MoodDetecter.detectMood();

        Printer.println("Your mood: ");
        Printer.println(face);
    }
}
