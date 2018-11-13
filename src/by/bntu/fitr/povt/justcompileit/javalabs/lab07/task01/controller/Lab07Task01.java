package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task01.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab07.util.UserInput;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task01.view.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task01.model.logic.Counter;

public class Lab07Task01 {

    public static void main(String[] args) {

        int AmountOfYears = UserInput.inputInt("Input the number of years of the dragon:");

        int AmountOfHeads = Counter.countHeads(AmountOfYears);
        int AmountOfEyes = Counter.countEyes(AmountOfHeads);

        Printer.println("");
        Printer.println("Amount of heads : " + AmountOfHeads);
        Printer.print("Amount of eyes : " + AmountOfEyes);

    }
}
