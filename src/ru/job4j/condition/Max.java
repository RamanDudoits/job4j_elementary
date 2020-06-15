package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        boolean can = first >= second;
        int result = can ? first : second;
        return result;
    }


}

