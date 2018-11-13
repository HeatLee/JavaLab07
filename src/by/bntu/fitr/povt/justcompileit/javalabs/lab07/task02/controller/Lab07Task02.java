package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task02.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab07.util.UserInput;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task02.model.logic.Verifier;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task02.view.Printer;


public class Lab07Task02 {
    public static void main(String[] args) {

        double a = UserInput.inputInt("Input a: ");
        double b = UserInput.inputInt("Input b: ");
        double c = UserInput.inputInt("Input c: ");

        double theGreatest = Verifier.findTheGreates(a ,b ,c);

        Printer.println("");
        Printer.print("The Greatest number: " + theGreatest);

    }
}
