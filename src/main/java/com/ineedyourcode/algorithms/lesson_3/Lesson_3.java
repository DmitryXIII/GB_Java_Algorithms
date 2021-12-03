package com.ineedyourcode.algorithms.lesson_3;

public class Lesson_3 {
    public static void main(String[] args) {
        Sherlock sherlock = new Sherlock();

        int[] array = sherlock.giveMeArray(100000000);

        sherlock.helpMeToFindLost(array);
        sherlock.helpMeToFindLost2(array);

    }
}
