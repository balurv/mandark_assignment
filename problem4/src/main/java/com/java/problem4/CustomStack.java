package com.java.problem4;

import java.util.LinkedList;
import java.util.Queue;

public class CustomStack<V> implements Lifo<V>{
    private Queue<V> queue1 = new LinkedList<>();
    private Queue<V> queue2 = new LinkedList<>();
    private int size;
    @Override
    public void push(V value) {
        queue2.add(value);
        size++;
        while(!queue1.isEmpty()){
            V val = queue1.peek();
            queue2.add(val);
            queue1.remove();
        }
        Queue<V> tempQ = queue1;
        queue1 = queue2;
        queue2 = tempQ;
    }

    @Override
    public V pop() {
        if(!queue1.isEmpty()){
            V val = queue1.remove();
            size--;
            return val;
        }
        return (V) new String("Stack is empty");
    }

    @Override
    public V top() {
        if(!queue1.isEmpty()){
            return queue1.peek();
        }
        return (V) new String("Stack is empty");
    }

    @Override
    public int size() {
        return this.size;
    }
}
