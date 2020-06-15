package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static int brRubleTORuRuble(int value) {
        int rsl = value * 31;
        return rsl;
    }

    public static void main(String[] args) {
        int in1 = 240;
        int expected = 4;
        int out = rubleToDollar(in1);
        boolean passed = expected == out;
        System.out.println("240 rubles are 4. Test result : " + passed);

        int in2 = 35;
        int expected2 = 1085;
        int out2 = brRubleTORuRuble(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("35 brRubles are 1085. Test result : " + passed2);

        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(240);
        int ruRub = Converter.brRubleTORuRuble(35);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("200 rubles are " + dollar + " dollar");
        System.out.println("35 brRub are " + ruRub + " ruRub");
    }
}