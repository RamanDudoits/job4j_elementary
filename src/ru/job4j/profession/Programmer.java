package ru.job4j.profession;

class Programmer extends Engineer {
    private String langProgram;

    public boolean tester() {
        return true;
    }

    public boolean programmer() {
        return false;
    }
}