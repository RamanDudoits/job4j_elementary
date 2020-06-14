package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height1 = 181;
        short height2 = 160;

        double man1 = Fit.manWeight(height1);
        double woman1 = Fit.womanWeight(height2);

        double woman2 = Fit.womanWeight((short) 165);
        double man2 = Fit.manWeight((short) 187);

        System.out.println("Man " + height1 + " is " + man1);
        System.out.println("Woman " + height2 + " is " + woman1);
        System.out.println(" ");
        System.out.println("Man 187 is " + man2);
        System.out.println("Woman 165 is " + woman2);
    }

}