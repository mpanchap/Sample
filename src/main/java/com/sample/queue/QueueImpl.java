package com.sample.queue;


public class QueueImpl implements Queue {

    Node pointVar;

    class Node {
        Object o;
        Node prevVar;

    }

    @Override
    public void push(Object o) {
        Node n = new Node();
        n.o = o;
        n.prevVar = pointVar;
        pointVar = n;
    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public Object poll() {
        Object pollObj;
        do {
            pollObj = pointVar != null && pointVar.o != null ? pointVar.o : null;
            if (pollObj == null) {
                return pollObj;
            }
            pointVar = pointVar.prevVar;
            if (pointVar.prevVar == null) {
                pollObj = pointVar.o;
            }
        }
        while (pointVar.prevVar != null);
        return pollObj;
    }

    public static void main(String[] args) {
        Queue is = new QueueImpl();
        is.push("hello");
        is.push("hello2");
        is.push("hello3");
        //is.push("hello3");
        Object ob = is.poll();
        is.peek();
    }
}
