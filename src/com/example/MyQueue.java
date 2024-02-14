package com.example;

import java.util.Stack;

public class MyQueue<E> {
    private Stack<E> stack1 = new Stack();
    private Stack<E> stack2 = new Stack<>();

    private void add(E a) {
        if (stack1.isEmpty()) {
            while (!stack2.isEmpty())
                stack1.push(stack2.pop());
        }
        stack1.push(a);
    }

    private E poll() {
        if (stack2.isEmpty()) {
            for (int i = 0; i < stack1.size(); i++) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    private E peek() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty())
                return null;
            else {
                int size = stack1.size();
                for (int i = 0; i < size; i++) {
                    stack2.push(stack1.pop());
                }
            }
        }
        return stack2.peek();
    }

    private void printQueue() {
        if(stack1.isEmpty()) {
            System.out.println("printing queue from tail to head.....");
            System.out.println(stack2);
        }
        else {
            System.out.println("printing queue from head to tail....");
            System.out.println(stack1);
        }
//        Stack<E> tmp = new Stack<>();
//        if (!stack1.isEmpty()) {
//            System.out.println("printing queue from head to tail.....");
//            tmp = stack1;
//        } else {
//            System.out.println("printing queue from tail to head....");
//            tmp = stack2;
//
//        }
//        int size = tmp.size();
//        for (int i = 0; i < size; i++) {
//            System.out.print(tmp.get(i) + ", ");
//        }
//        System.out.println();
    }

    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.printQueue();
        //System.out.println(myQueue.stack1);
       // System.out.println(myQueue.stack2);
        System.out.println("queue head: "+(Integer)myQueue.peek());
        myQueue.poll();
        myQueue.poll();
        myQueue.add(5);
        myQueue.add(6);
        myQueue.printQueue();
        System.out.println("queue head: "+(Integer)myQueue.peek());

    }
}
