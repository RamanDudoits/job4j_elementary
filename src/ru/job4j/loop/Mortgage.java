package ru.job4j.loop;

public class Mortgage {
    public int year(double amount, int salary, double percent) {

        int year = 0;
        double balance;
        while (amount < salary) {
            balance = amount * percent / 100;
            amount = amount + balance;
          amount = amount - salary;
          if (amount < 0) {
              year++;
              break;
          }
          year++;
        }
        return year;
    }
}