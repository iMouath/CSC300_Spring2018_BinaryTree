package com.example.awesomefat.csc300_spring2018_binarytree;

/**
 * Created by awesomefat on 3/6/18.
 */

public class Node
{
    private int payload;
    private Node leftChild;
    private Node rightChild;

    public Node(int payload)
    {
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


}
