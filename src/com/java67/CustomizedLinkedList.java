package com.java67;

public class CustomizedLinkedList {
    public static void main(String[] args) {
        Node node = new Node(null, 10);
        int size = 10;
        for (int i = 9; i >= 0; i--) {
            Node tmp = new Node(node, i);
            node = tmp;
            System.out.print(node);
        }

        //node.toString();

        //System.out.println(print(node));
    }

   //
}
