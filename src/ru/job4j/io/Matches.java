package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        int rsl1 = 0;
        int rsl2 = 0;
        while (matches > 0) {
            System.out.println("Первый игрок берёт спички в количестве 1-3");
            int player1 = Integer.valueOf(input.nextLine());
            matches = matches - player1;
            rsl1 = rsl1 + player1;
            System.out.println("Спичек осталось " + matches);
            System.out.println("Второй игрок берёт спички в количестве 1-3");
            int player2 = Integer.valueOf(input.nextLine());
            matches = matches - player2;
            rsl2 = rsl2 + player2;
            System.out.println("Спичек осталось " + matches);
        }
        if (rsl1 > rsl2) {
            System.out.println("Победил первый игрок");
        } else {
            System.out.println("Победил второй игрок1");
        }
    }
}
