package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task05.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task05.view.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.util.UserInput;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task05.model.logic.Finder;

public class Task05 {

    public static void main(String[] args) {

        Character letter = UserInput.inputChar("Input some letter: ");

        String answer = Finder.findLetter(letter);

        Printer.println("Your letter is " + answer);

    }
}
