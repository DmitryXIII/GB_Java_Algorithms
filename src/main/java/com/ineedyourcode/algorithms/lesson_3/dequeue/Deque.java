package com.ineedyourcode.algorithms.lesson_3.dequeue;

import com.ineedyourcode.algorithms.lesson_3.queue.Queue;

public interface Deque<E> extends Queue<E> {

    boolean insertLeft(E value);

    boolean insertRight(E value);

    E removeLeft();

    E removeRight();


}
