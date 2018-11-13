package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task05.model.logic;

import java.util.Arrays;

public class Finder {
    //                     1
//    private static final Character[] VOWEL = {'e',  'y', 'u',  'i', 'o', 'a'};
//
//    public  static String findLetter(char letter){
//
//        letter = Character.toLowerCase(letter);
//        String answer = "Not a letter...";
//
//        if (Character.isLetter(letter)) {
//            if (Arrays.asList(VOWEL).contains(letter)) {
//                answer = "vowel";
//            } else {
//                answer = "consonant";
//            }
//        }
//
//        return answer;
//    }
//                      2
//    public static String findLetter(char letter) {
//        letter = Character.toLowerCase(letter);
//
//        String answer = "Not a letter...";
//
//        if (Character.isLetter(letter)) {
//            switch (letter) {
//                case 'a':
//                case 'e':
//                case 'u':
//                case 'i':
//                case 'o':
//                    answer = "vowel";
//                    break;
//                default:
//                    answer = "consonant";
//                    break;
//            }
//        }
//        return  answer;
//    }
//                             3
//public static String findLetter(char letter) {
//    letter = Character.toLowerCase(letter);
//
//    String answer = "not a letter...";
//
//    if (Character.isLetter(letter)) {
//        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ) {
//            answer = "vowel";
//        }
//        else {
//            answer = "consonant";
//        }
//    }
//    return  answer;
//}
//                            4
//    public static String findLetter(char letter) {
//        letter = Character.toLowerCase(letter);
//
//        String answer = "not a letter...";
//
//        if (Character.isLetter(letter)) {
//            answer = (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')?
//                    "vowel": "consonant";
//        }
//        return  answer;
//    }
//                            5
//    public static final String VOWELS = "aeoiu";
//
//    public static String findLetter(char letter) {
//        letter = Character.toLowerCase(letter);
//        String letterInString = Character.toString(letter);
//
//        String answer = "not a letter...";
//
//        if (Character.isLetter(letter)) {
//            if (vowels.contains(letterInString)) {
//                answer = "vowel";
//            } else {
//                answer = "consonant";
//            }
//        }
//        return  answer;
//    }
//                              6
//    public static final  char[] VOWELS = {'e',  'y', 'u',  'i', 'o', 'a'};
//    public static String findLetter(char letter) {
//        letter = Character.toLowerCase(letter);
//
//        String answer = "not a letter...";
//
//        if (Character.isLetter(letter)) {
//            boolean isVowelLetter = false;
//            for (int i = 0; i <= VOWELS.length && !isVowelLetter; i++) {
//                if (letter == VOWELS[i]) {
//                    isVowelLetter = true;
//                }
//            }
//            if (isVowelLetter) {
//                answer = "vowel";
//            } else {
//                answer = "consonant";
//            }
//        }
//        return  answer;
//    }
//                          7
//    public static String findLetter(char letter) {
//        String letterInString = Character.toString(letter);
//
//        String answer = "not a letter...";
//
//        if (Character.isLetter(letter)) {
//            boolean isVowelLetter = letterInString.matches("^(?i:[aeuio]).*");
//            if (isVowelLetter) {
//                answer = "vowel";
//            } else {
//                answer = "consonant";
//            }
//        }
//        return  answer;
//    }
//                               8
    public static String findLetter(char letter) {
        letter = Character.toLowerCase(letter);

        String answer = "not a letter...";

        if (Character.isLetter(letter)) {
            answer = ("aeuio".indexOf(letter) != -1)? "vowel" : "consonant";
        }
        return  answer;
    }
}
