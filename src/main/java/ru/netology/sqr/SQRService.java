package ru.netology.sqr;

public class SQRService {
    public int numberOfSquares(int borderA, int borderB) {
        int a = 0;
        for (int i = 10; i <= 99; i++) {
            if (borderB > i * i && borderA < i * i) {
                a = a + 1;
            }
        }
        return a;
    }
}
