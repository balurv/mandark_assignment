package com.java.problem4;

public interface Lifo<V> {
    void push(V value);
    V pop();
    V top();
    int size();
}
