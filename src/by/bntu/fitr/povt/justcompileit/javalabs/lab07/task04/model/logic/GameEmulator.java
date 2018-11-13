package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task04.model.logic;

import java.util.Random;

import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task04.model.data.DataStore;

public class GameEmulator {

    private static final int COUNT = 6;
    private static final Random random = new Random();

    public static void throwFirsDice() {
        DataStore.changeFistDice(random.nextInt(COUNT + 1));
    }

    public static void throwSecondDice() {
        DataStore.changeSecondDice(random.nextInt(COUNT + 1));
    }

    public static int simulateGame() {
        int winPoints = 0;

        int first = DataStore.showFirstDice();
        int second = DataStore.showSecondDice();

        if (first == second) {
            winPoints += (first + second) * 2;
        } else {
            winPoints += first;
            winPoints += second;
        }
        return winPoints;
    }

}
