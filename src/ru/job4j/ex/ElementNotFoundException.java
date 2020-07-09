package ru.job4j.ex;

public class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super(message);
    }

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                rsl = i;
            } else {
                throw new ElementNotFoundException("Not this element");
            }
        }
        return rsl;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        String[] value = {"1", "qwe", "asd"};
        try {
            indexOf(value, "2");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
