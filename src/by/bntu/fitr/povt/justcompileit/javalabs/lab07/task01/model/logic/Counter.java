package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task01.model.logic;

public class Counter {

    public static final int DEFAULT_NUMBER_OF_HEADS = 3;
    public static final int FIRST_PERIOD = 200;
    public static final int SECOND_PERIOD = 300;
    public static final int INCRIMENT_ON_FIRST_PERIOD = 3;
    public static final int INCRIMENT_ON_SECOND_PERIOD = 2;
    public static final int INCRIMENT_THIRD_PERIOD = 1;

    public static int countHeads(int amountOfYears) {

        int headsCount = 0;

        if (amountOfYears <= 0) {
            return headsCount;
        }
        if (amountOfYears < FIRST_PERIOD) {

            headsCount = DEFAULT_NUMBER_OF_HEADS + amountOfYears * INCRIMENT_ON_FIRST_PERIOD;

        } else if (amountOfYears < SECOND_PERIOD) {
            headsCount = DEFAULT_NUMBER_OF_HEADS + FIRST_PERIOD * INCRIMENT_ON_FIRST_PERIOD -
                    FIRST_PERIOD * INCRIMENT_ON_SECOND_PERIOD + INCRIMENT_ON_SECOND_PERIOD * amountOfYears;
        } else {

            headsCount = DEFAULT_NUMBER_OF_HEADS + FIRST_PERIOD * INCRIMENT_ON_FIRST_PERIOD +
                    SECOND_PERIOD * INCRIMENT_ON_SECOND_PERIOD - SECOND_PERIOD * INCRIMENT_THIRD_PERIOD +
                    amountOfYears * INCRIMENT_THIRD_PERIOD;

        }

        return headsCount;
    }

    public static int countEyes(int AmountOfHeads) {

        return AmountOfHeads * 2;

    }
}
