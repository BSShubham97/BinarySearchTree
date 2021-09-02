package com.bridgelabz;

public class BiNode<T> {
    T data;
    BiNode<T> left;
    BiNode<T> right;

    public BiNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
