package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task03.model.logic;

import java.util.Random;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task03.model.data.DataStore;

public class MoodDetecter {

    public static String detectMood(DataStore dataStore){

        Random random = new Random();

        String mood = dataStore.getKAPPA();

        switch (random.nextInt(dataStore.getCOUNT_OF_MOODS() - 1)){
            case 0:
                mood = dataStore.getACCEPT();
                break;
            case 1:
                mood = dataStore.getDERP_FACE();
                break;
            case 2:
                mood = dataStore.getMEGUSTA();
                break;
        }
        return mood;
    }
}
