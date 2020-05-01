package ru.job4j.calculator;

public class Calculator {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }
    public static int func1(int x){
        int y = x * x + 1;
        return y;
    }
    public static void main(String[] args) {
        int result = Calculator.func1(100);
    }
}
