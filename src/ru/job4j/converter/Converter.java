package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value/ 60; /* формула перевода рублей в доллоры. */
        return rsl;
    }
    public static int brRubleTORuRuble ( int value)
    {
        int rsl = value * 31;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(200);
        int ruRub = Converter.brRubleTORuRuble(35);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("200 rubles are " + dollar + " dollar");
        System.out.println("35 brRub are " + ruRub + " ruRub" );
    }
}