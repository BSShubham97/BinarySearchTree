package com.bridgelabz;

public class BinarySearchTree<T extends Comparable<T>>{
    private BiNode<T> root;

    public void add(T data){
        this.root= this.addRecursive(root,data);
    }
    public BiNode<T> addRecursive(BiNode<T> currentNode ,T data ){
        if(currentNode==null)
        return new BiNode<>(data);
        if(data.compareTo(currentNode.data) > 0)
            currentNode.right = addRecursive(currentNode.right, data);
        else if (data.compareTo(currentNode.data) < 0)
            currentNode.left = addRecursive(currentNode.left, data);

        return currentNode;
    }


}