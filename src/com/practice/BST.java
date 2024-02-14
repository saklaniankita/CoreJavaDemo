package com.practice;


/**
 * Implementing binary Search Tree
 */
public class BST {
    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            String result = String.valueOf(value);

            return result;
        }
    }

    static Node node = null;
    static int[] nodes = new int[]{8, 4, 10, 2, 6};

    public static void main(String[] args) {
        boolean root = true;
        for (int n : nodes) {
            if (root) {
                node = new Node(n);
                root = false;
                continue;
            }
            Node newNode = new Node(n);
            traverse(newNode, node);
            System.out.println(node);
        }
    }

    private static void traverse(Node newNode, Node node) {
        while (true) {
            if(newNode.value < node.value){
                if(node.left == null){
                    node.left = newNode;
                    break;
                }else{
                    node = node.left;
                    continue;
                }

            }else{
                if(node.right == null){
                    node.right = newNode;
                    break;
                }else{
                    node = node.right;
                    continue;
                }
            }
        }
    }
}
