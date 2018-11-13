package by.bntu.fitr.povt.justcompileit.javalabs.lab07.util;

import java.util.Random;

public class Randomizer {

    private static final Random random = new Random();

    public static int nextRandomInt(int last){

        return random.nextInt(last);
    }
}
