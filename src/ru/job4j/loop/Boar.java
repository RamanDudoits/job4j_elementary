package ru.job4j.loop;

public class Boar {
    public static void paint(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int z = 0; z < width; z++) {
                if ((i + z) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("  ");
                }
            }
            /* добавляем перевод на новую строку. */
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}