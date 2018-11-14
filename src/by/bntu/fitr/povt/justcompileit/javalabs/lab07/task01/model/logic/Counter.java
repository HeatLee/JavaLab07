package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task01.model.logic;

public class Counter {

    private static final int DEFAULT_NUMBER_OF_HEADS = 3;
    private static final int FIRST_PERIOD = 200;
    private static final int SECOND_PERIOD = 300;
    private static final int INCRIMENT_ON_FIRST_PERIOD = 3;
    private static final int INCRIMENT_ON_SECOND_PERIOD = 2;
    private static final int INCRIMENT_THIRD_PERIOD = 1;

    public static int countHeads(int amountOfYears) {

        int headsCount = 0;

        if (amountOfYears > 0) {

            if (amountOfYears < FIRST_PERIOD) {

                headsCount = DEFAULT_NUMBER_OF_HEADS + amountOfYears * INCRIMENT_ON_FIRST_PERIOD;

            } else if (amountOfYears < SECOND_PERIOD) {
                headsCount = DEFAULT_NUMBER_OF_HEADS + FIRST_PERIOD + amountOfYears * 2;
                //headsCount = DEFAULT_NUMBER_OF_HEADS + FIRST_PERIOD * INCRIMENT_ON_FIRST_PERIOD -
                        //FIRST_PERIOD * INCRIMENT_ON_SECOND_PERIOD + INCRIMENT_ON_SECOND_PERIOD * amountOfYears;
            } else {
                headsCount = DEFAULT_NUMBER_OF_HEADS + FIRST_PERIOD + SECOND_PERIOD +
                        amountOfYears * INCRIMENT_THIRD_PERIOD;
//                headsCount = DEFAULT_NUMBER_OF_HEADS + FIRST_PERIOD * INCRIMENT_ON_FIRST_PERIOD +
//                        SECOND_PERIOD * INCRIMENT_ON_SECOND_PERIOD - SECOND_PERIOD * INCRIMENT_THIRD_PERIOD +
//                        amountOfYears * INCRIMENT_THIRD_PERIOD;

            }
        }

        return headsCount;
    }

    public static int countEyes(int AmountOfHeads) {

        return AmountOfHeads * 2;

    }
}
