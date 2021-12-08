package com.ineedyourcode.algorithms.lesson_3;

import com.ineedyourcode.algorithms.lesson_3.dequeue.Deque;
import com.ineedyourcode.algorithms.lesson_3.dequeue.DequeImpl;

public class Lesson_3 {
    public static void main(String[] args) {

        /**
         * задача на поиск пропавшего элемента в массиве
         */
        Sherlock sherlock = new Sherlock();
        int[] array = sherlock.giveMeArray(100_000_000);
        sherlock.helpMeToFindLost(array);

        /**
         * Deque
         */
        Deque<Integer> deque = new DequeImpl<>(10);

        for (int i = 1; i < 6; i++) { //[15, 14, 13, 12, 11, 1, 2, 3, 4, 5]
            deque.insertRight(i);
            deque.insertLeft(i + 10);
        }

        deque.removeLeft(); // [14, 13, 12, 11, 1, 2, 3, 4, 5]
        deque.removeRight(); // [14, 13, 12, 11, 1, 2, 3, 4]

        while (!deque.isEmpty()) {
            System.out.println(deque.remove());
        }
    }
}