package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Red Hat", 15);
        Book book2 = new Book("Lord of the Rings", 800);
        Book book3 = new Book("Clean code", 300);
        Book book4 = new Book("JAVA", 500);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getNameBook() + " - " + bk.getPages());
        }
        System.out.println(" ");
        Book temp = books[0];
        books[0] = books[2];
        books[2] = temp;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getNameBook() + " - " + bk.getPages());
        }
        System.out.println(" ");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if ("Clean code".equals(bk.getNameBook())) {
                System.out.println("This book is " + bk.getNameBook());
            }
        }
    }
}
