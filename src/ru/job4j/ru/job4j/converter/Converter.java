package ru.job4j.ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value){
        int rsl = value/70;
        return rsl;
    }
    public static int rubleToDollar(int value){
        int rsl = value/60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(1000);
        int dollar = Converter.rubleToDollar(2000);
        System.out.println("1000 rubles are " + euro + " euro.");
        System.out.println("2000 rubles are " + dollar + " dollar.");
    }
}
