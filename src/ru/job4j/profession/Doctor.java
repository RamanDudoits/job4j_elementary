package ru.job4j.profession;

public class Doctor extends Profession {

    private boolean internship;

    public void heal(){
    }

    class Surgeon extends Doctor {

        private String animal;
        private String human;

        public void diagnosisAnimal(String animal) {
        }

        public void diagnosisHuman(String human) {
        }

    }

    class Dentist extends Doctor {
        private int toothNumber;

        public boolean caries(int toothNumber) {
        }
    }
}
