package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task02.model.logic;

public class Verifier {


    public static double findTheGreates(double a, double b, double c) {

        double theGreatestValue = c;

        if (a >= b && a >= c) {
            theGreatestValue = a;
        }else if (b >= c) {
            theGreatestValue = b;
        }

        return  theGreatestValue;
    }
}
