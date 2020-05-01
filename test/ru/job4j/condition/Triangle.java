package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double a, double b, double c){
        if (((a*b + a*c) > b*c )&&(( a*c + b*c) > a*b) && ((a*b + b*c) > a*c)){
            return true;
        }
        return false;
    }
}
