package ru.job4j.converter;

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
        int inEuro = 1000;
        int inDollar = 2000;
        int expectedEuro = 14;
        int expectedDollar = 33;
        int euro = Converter.rubleToEuro(inEuro);
        int dollar = Converter.rubleToDollar(inDollar);
        boolean passedEuro = expectedEuro == euro;
        boolean passedDollar = expectedDollar == dollar;
        System.out.println(inEuro + " rubles are " + euro + " euro. Test result : " + passedEuro);
        System.out.println(inDollar + " rubles are " + dollar + " dollar. Test result : " + passedDollar);
    }
}
