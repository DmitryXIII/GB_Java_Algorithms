package com.ineedyourcode.algorithms.lesson_5;

public class Lesson_5 {
    public static void main(String[] args) {
//        рекурсионное возведение в степень
        System.out.println("2 ^ 3 = " + doPow(2, 3));
        System.out.println("2 ^ -3 = " + doPow(2, -3));

//        задача с рюкзаком
        System.out.println("=================================");
        Bag.packMyBag();
    }

    public static double doPow(int a, int pow) {
        if (pow == 0) {
            return 1;
        }

        if (pow == 1) {
            return a;
        }

        if (pow == -1) {
            return 1.0 / a;
        }

        if (pow < -1) {
            return 1.0 / (a * doPow(a, (pow + 1) * -1));
        }

        return a * doPow(a, pow - 1);
    }
}
