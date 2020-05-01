package ru.job4j.condition;

public class Point {

    static double distance(int x1, int y1, int x2, int y2){
        double x = Math.pow((x2 - x1),2);
        double y = Math.pow((y2 - y1),2);
        double result = Math.sqrt((x + y));
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(1, 1, 2, 2);
        double result3 = Point.distance(1, 2, 2, 3);
        double result4 = Point.distance(1, 2, 2, 0);

        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
