package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0, j = 0; i < pref.length; i++ , j++) {
            if (pref[i] != word[j]){
                result = false;
                break;
            }
        }
        return result;
    }
}
