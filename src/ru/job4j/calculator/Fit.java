package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height){
        double rls = (height - 100)*1.15;
        return rls;
    }
    public static double womanWeight(double height){
        double rls = (height - 110)*1.15;
        return rls;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(180);
        double woman = Fit.womanWeight(170);
        System.out.println("Man 180 is " + man);
        System.out.println("Woman 170 is " + woman);
    }
}
