package ru.job4j.profession;

public class Engineer extends Profession {

    private int experienceJob;

    public void creator(){

    }

    class Programmer extends Engineer {
        private String langProgram;

        public boolean tester() {
        }

        public boolean programmer() {
        }
    }

    class Builder extends Engineer {
        private String nameJob;

        public void foreman(){
        }

        public void workingMan() {
        }
    }
}
