package ru.job4j.converter;

/**
 * The type Converter currency.
 */
public class Converter {

    /**
     * Ruble to euro int.
     *
     * @param value the value
     * @author Angelina Solodova
     * @return the int euro
     */
    public static int rubleToEuro(int value){
        int rsl = value/70;
        return rsl;
    }

    /**
     * Ruble to dollar int.
     *
     * @param value the value
     * @return the int dollar
     */
    public static int rubleToDollar(int value){
        int rsl = value/60;
        return rsl;
    }

    /**
     * Main.
     *
     * @param args the input arguments
     */
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
