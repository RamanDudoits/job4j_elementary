package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String transfer = "Неизвестное слово " + eng;
        return transfer;
    }

    public static void main(String[] args) {
        DummyDic transfer = new DummyDic();
       String word = transfer.engToRus("Policeman");
        System.out.println(word);
    }
}
