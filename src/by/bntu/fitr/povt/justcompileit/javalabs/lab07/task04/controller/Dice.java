package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task04.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task01.view.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task04.model.logic.GameEmulator;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task04.model.data.DataStore;

public class Dice {

    public static void main(String[] args) {
        GameEmulator.throwFirsDice();
        GameEmulator.throwSecondDice();

        int firstDice = DataStore.showFirstDice();
        int secondDice = DataStore.showSecondDice();

        int winPoints = GameEmulator.simulateGame();

        Printer.println("Your threw : " + firstDice + " and " + secondDice);
        Printer.println("Your win points : " + winPoints);
    }
}
