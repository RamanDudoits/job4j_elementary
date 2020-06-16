package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 1; i <= number; i++) {
            if (number == 1) {
                prime = false;
                break;
            }
            for (int j = 2; j <= number / j; j++) {
                if (number % j == 0) {
                    prime = false;
                }
            }
        }
        return prime;
    }
}
