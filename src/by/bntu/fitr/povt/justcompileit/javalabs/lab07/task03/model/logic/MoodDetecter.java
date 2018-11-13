package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task03.model.logic;

import java.util.Random;

public class MoodDetecter {

    private static final String DERP_FACE = "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
            "░░░░░░░░░░░░░▄▄▄▄▄▄▄░░░░░░░░░\n" +
            "░░░░░░░░░▄▀▀▀░░░░░░░▀▄░░░░░░░\n" +
            "░░░░░░░▄▀░░░░░░░░░░░░▀▄░░░░░░\n" +
            "░░░░░░▄▀░░░░░░░░░░▄▀▀▄▀▄░░░░░\n" +
            "░░░░▄▀░░░░░░░░░░▄▀░░██▄▀▄░░░░\n" +
            "░░░▄▀░░▄▀▀▀▄░░░░█░░░▀▀░█▀▄░░░\n" +
            "░░░█░░█▄▄░░░█░░░▀▄░░░░░▐░█░░░\n" +
            "░░▐▌░░█▀▀░░▄▀░░░░░▀▄▄▄▄▀░░█░░\n" +
            "░░▐▌░░█░░░▄▀░░░░░░░░░░░░░░█░░\n" +
            "░░▐▌░░░▀▀▀░░░░░░░░░░░░░░░░▐▌░\n" +
            "░░▐▌░░░░░░░░░░░░░░░▄░░░░░░▐▌░\n" +
            "░░▐▌░░░░░░░░░▄░░░░░█░░░░░░▐▌░\n" +
            "░░░█░░░░░░░░░▀█▄░░▄█░░░░░░▐▌░\n" +
            "░░░▐▌░░░░░░░░░░▀▀▀▀░░░░░░░▐▌░\n" +
            "░░░░█░░░░░░░░░░░░░░░░░░░░░█░░\n" +
            "░░░░▐▌▀▄░░░░░░░░░░░░░░░░░▐▌░░\n" +
            "░░░░░█░░▀░░░░░░░░░░░░░░░░▀░░░\n";

    private static final String KAPPA = "░░░░▄▀▀▀▀▀█▀▄▄▄▄░░░░\n" +
            "░░▄▀▒▓▒▓▓▒▓▒▒▓▒▓▀▄░░\n"+
            "▄▀▒▒▓▒▓▒▒▓▒▓▒▓▓▒▒▓█░\n"+
            "█▓▒▓▒▓▒▓▓▓░░░░░░▓▓█░\n"+
            "█▓▓▓▓▓▒▓▒░░░░░░░░▓█░\n"+
            "▓▓▓▓▓▒░░░░░░░░░░░░█░\n"+
            "▓▓▓▓░░░░▄▄▄▄░░░▄█▄▀░\n"+
            "░▀▄▓░░██▓▓▒░░░██▓▒░░░\n"+
            "▀▄░░░░░░░░░░░░▀▄░█░\n"+
            "░▀░▀░░░░░░▒▀▄▄▒▀░░█░\n"+
            "░░▀░░░░░░███████░█░\n"+
            "░░░▀▄▄▒▒░░░░▀▀░░▄▀░░\n"+
            "░░░░░▀█▄▒▒░░░░░▄▀░░░\n"+
            "░░░░░░░░▀▀█▄▄▄▄▀░░░░\n";

    private static final String MEGUSTA = "░░░░░░░░░░░░░░░▄▄▄▄░░░░░░░░░░░░░░░░\n"+
            "░░░░░░░░░▄▄▀▀▀▀▀░░▀▀▀▀▀▀▄▄░░░░░░░░░\n"+
            "░░░░░░▄▀░░░░░░░░░░░░░░░░░░▀▀▄░░░░░░\n"+
            "░░░░▄▀░░░░░░░░░░░░░░░░░░░░░░░▀▄░░░░\n"+
            "░░▄█▀░░░░░░░░░░░░░░░░░░░░░░░░░░▀▄░░\n"+
            "░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▀▄░\n"+
            "░█▀░░░░░░░░░▀▀▀▀▀▄███▄█▄░░▀▀░░░░░█░\n"+
            "▄█░░░░░░▄██████████░░░░██████▄▄░░░█\n"+
            "█░░░░░░░░▄██▄░░░██░░▄░░██░░░▄▀░░░░█\n"+
            "█░░░░░░░▀███▄░▄▄█░░░█▄░▀█▄▄▄▄█░░░░█\n"+
            "█░░░░░░░░▀█████▀░▄░░██▄░░████▀░░░▄▀\n"+
            "█░░▄░░░░░░░▀▀█▄▄██████████▄░░░░░░█░\n"+
            "▀▄▀░░▄▄▄█▀▀████████▄███▀▀█████▄▄▄█░\n"+
            "░▀▄░░██░░░░░░░░▀▀▀█████▀▀▀░░░░▄▀█▀░\n"+
            "░░░█▄░░▀░░░░░░░░░░░▀▀▄░░░░░░░░░▄█░░\n"+
            "░░░░░▀▄░░░░░░░░░░░░░░▀░░░░░░░▄▀░░░░\n"+
            "░░░░░░░▀▀▄▄░░░░░░░░░░░░░░░▄▄▀░░░░░░\n"+
            "░░░░░░░░░░░▀▀▀▀▄▄▄▄▄▄▄▄▀▀▀░░░░░░░░░\n";

    private static final String ACCEPT = "░░░░░░░░░░░░▄▄▄█▀▀▀▀▀▀▀▀█▄▄▄░░░░░░░░░░░░\n"+
            "░░░░░░░░▄▄█▀▀░░░░░░░░░░░░░░▀▀█▄▄░░░░░░░░\n"+
            "░░░░░░▄█▀░░░░▄▄▄▄▄▄▄░░░░░░░░░░░▀█▄░░░░░░\n"+
            "░░░░▄█▀░░░▄██▄▄▄▄▄▄▄██▄░░░░▄█▀▀▀▀██▄░░░░\n"+
            "░░░█▀░░░░█▀▀▀░░▄██░░▄▄█░░░██▀▀▀███▄██░░░\n"+
            "░░█░░░░░░▀█▀▀▀▀▀▀▀▀▀██▀░░░▀█▀▀▀▀███▄▄█░░\n"+
            "░█░░░░░░░░░▀▀█▄▄██▀▀░░░░░░░░▀▄▄▄░░░▄▄▀█░\n"+
            "█▀░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▀▀▀▀▀░░▀█\n"+
            "█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄░░░░█\n"+
            "█░░░░░░░░░░░░░░░░░░░░░░░░▄▄▄▄▄██░░▀█░░░█\n"+
            "█░░░░░░░░░░░░░░█░░░▄▄▄█▀▀▀░░░▄█▀░░░░░░░█\n"+
            "█░░░░░░░░░░░░░░░░░░▀░░░░░░░░█▀░░░░░░░░░█\n"+
            "█▄░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄█\n"+
            "░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█░\n"+
            "░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█░░\n"+
            "░░░█▄░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄█░░░\n"+
            "░░░░▀█▄░░░░░░░░░░░░░░░░░░░░░░░░░░▄█▀░░░░\n"+
            "░░░░░░▀█▄░░░░░░░░░░░░░░░░░░░░░░▄█▀░░░░░░\n";

    public static final int COUNT_OF_MOODS = 4;

    public static String detectMood(){

        Random random = new Random();

        String mood = KAPPA;

        switch (random.nextInt(COUNT_OF_MOODS - 1)){
            case 0:
                mood = ACCEPT;
                break;
            case 1:
                mood = DERP_FACE;
                break;
            case 2:
                mood = MEGUSTA;
                break;
        }
        return mood;
    }
}