package com.sample.stack;

public class StackImpl implements Stack {

    Node pointVar;

    @Override
    public void push(Object o) {
        Node n = new Node();
        n.o = o;
        n.prev = pointVar;
        pointVar = n;
    }

    @Override
    public Object pop() {
        return pointVar.o = new Node();
    }

    @Override
    public Object peek() {
        return pointVar;
    }


    static class Node {
        public Object o;
        public Node prev;

    }

    public static void main(String[] args) {
        Stack is = new StackImpl();
        is.push("hello");
        is.push("hello2");
        Object ob = is.pop();
        is.peek();
        is.push("hello3");
    }
}
