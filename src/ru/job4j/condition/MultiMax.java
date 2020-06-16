package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
    int  result;
    if ((first > second) && (first > third)) {
        result = first;
    } else if ((second > third) && (second > first)) {
        result = second;
    } else {
        result = third;
    }
    return result;
    }
}
