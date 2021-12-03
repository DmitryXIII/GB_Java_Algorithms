package com.ineedyourcode.algorithms.lesson_3;

public class Lesson_3 {
    public static void main(String[] args) {
        Sherlock sherlock = new Sherlock();
        int[] array = sherlock.giveMeArray(100_000_000);
        sherlock.helpMeToFindLost(array);
    }
}
