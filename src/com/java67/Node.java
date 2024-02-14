package com.java67;

public class Node {
    private Node next;
    private int data;

    public Node(Node next, int data) {
        this.next = next;
        this.data = data;
    }

    public Node getNode() {
        return next;
    }

    public void setNode(Node node) {
        this.next = node;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.valueOf(data+", ");
    }
}
