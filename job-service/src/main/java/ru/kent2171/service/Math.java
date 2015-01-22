package ru.kent2171.service;

public class Math {

    public static Long factorial(int i) {
        int j =1;
        Long result = 1L;

        while (i > 0) {
            result = result * j;
            i--;
            j++;
        }
        return result;
    }
}
