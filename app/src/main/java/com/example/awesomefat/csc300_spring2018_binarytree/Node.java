package com.example.awesomefat.csc300_spring2018_binarytree;

/**
 * Created by awesomefat on 3/6/18.
 */

public class Node {
    private int payload;
    private Node leftChild;
    private Node rightChild;


    public Node(int payload) {
        this.payload = payload;
        this.leftChild = null;
        this.rightChild = null;

    }

    public int getPayload() {
        return payload;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public void add(int payload) {
        if (payload <= this.payload) {
            if (this.leftChild == null) {
                this.setLeftChild(new Node(payload));
            } else {
                System.out.println("Left ");
                this.leftChild.add(payload);
            }
        } else {
            if (this.rightChild == null) {
                this.setRightChild(new Node(payload));
            } else {
                System.out.println("Right ");
                this.rightChild.add(payload);
            }
        }
    }
}
