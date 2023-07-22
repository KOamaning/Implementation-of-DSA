package com.example.amaning_kwaku_opoku_5582;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private List<T> items;

    public Queue() {
        items = new ArrayList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void enqueue(T item) {
        items.add(item);
    }

    public T dequeue() {
        if (!isEmpty()) {
            return items.remove(0);
        } else {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return items.get(0);
        } else {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
    }

    public int size() {
        return items.size();
    }
}
