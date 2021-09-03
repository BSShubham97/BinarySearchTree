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

    public void getSize() {
        int size = getSizeRecursively(root);

        if (size == 0)
            System.out.println("Tree is empty");
        else
            System.out.println("Elements in tree = " + size);
    }

    private int getSizeRecursively(BiNode<T> root) {
        int size;

        if (root == null)
            size = 0;
        else
            size = this.getSizeRecursively(root.left) + 1 + this.getSizeRecursively(root.right);

        return size;
    }

    /**
     * Search Method
     * @param data Data to be search if present 
     */
    public void searchElement(T data) {
        BiNode<T> currentNode = this.searchRecursively(root, data);
        System.out.println(currentNode.data + " FOUND");
    }

    private BiNode<T> searchRecursively(BiNode<T> currentNode, T data) {
        if (currentNode == null )
            return currentNode;

        if (data.compareTo(currentNode.data) < 0)
            return searchRecursively(currentNode.left, data);

        if (data.compareTo(currentNode.data) > 0)
            return searchRecursively(currentNode.right, data);

        return currentNode;
    }
}