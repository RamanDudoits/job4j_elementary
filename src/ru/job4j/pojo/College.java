package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        License license = new License();
        license.setName("Raman Victorovich Dudoit");
        license.setGroup(12);
        license.setDate("01.09.2011");
        System.out.println(license.getName() + " is studying in group " + license.getGroup() + " entered in " + license.getDate());
    }
}
