package com.ineedyourcode.algorithms.lesson_3;

public class Lesson_3 {
    public static void main(String[] args) {
        Sherlock sherlock = new Sherlock();

        for (int i = 0; i < 1000; i++) {
            int[] array = sherlock.giveMeArray(100_000_000);

            sherlock.helpMeToFindLost(array);
            sherlock.helpMeToFindLost2(array);
        }

        /*int[] array = sherlock.giveMeArray(100_000_000);

        sherlock.helpMeToFindLost(array);
        sherlock.helpMeToFindLost2(array);*/

    }
}
