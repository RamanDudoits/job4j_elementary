package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        int count = 0;
        while (matches > 0) {
            System.out.println("Игрок берёт спички в количестве 1-3");
            int player = Integer.valueOf(input.nextLine());
            matches = matches - player;
            System.out.println("Спичек осталось " + matches);
            count++;
        }
        if (count % 2 == 0) {
            System.out.println("Победил второй игрок!!");
        } else {
            System.out.println("Победил первый игрок!!");
        }
    }
}
