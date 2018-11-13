package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task04.model.data;

public  class DataStore {
    private static int firstDice = 0;
    private static int secondDice = 0;

    public static int showFirstDice() {
        return firstDice;
    }

    public static int showSecondDice() {
        return secondDice;
    }

    public static void changeFistDice(int value) {
        firstDice = value;
    }

    public static void changeSecondDice(int value) {
        secondDice = value;
    }
}
