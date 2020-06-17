package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] func = new int[5];
        for (int i = 0; i < func.length; i++) {
            func[i] = i * 2 + 3;
        }
            for (int j = 0; j < func.length; j++) {
                System.out.println(func[j]);
            }
    }
}
