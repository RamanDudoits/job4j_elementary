package ru.job4j;

public class Multiple {
    public static void main(String[] args) {
        int x = 1;
        int y;
       int count;
        for (int i = 1; i <= 9; i++) {
            count = i;
            y = x * count;
            System.out.println(x + " * " + count + " = " + y);
        }
    }
}
