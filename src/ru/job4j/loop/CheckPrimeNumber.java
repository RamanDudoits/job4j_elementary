package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
            for (int j = 2; j <= number / j; j++) {
                if (number % j == 0) {
                    prime = false;
                }
            }
        return prime;
    }
}
