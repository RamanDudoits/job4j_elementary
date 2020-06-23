package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery battery = new Battery(100);
        Battery another = new Battery(50);
        System.out.println(battery.load + " " + another.load);
        battery.exchange(another);
        System.out.println(another.load);
    }
}
