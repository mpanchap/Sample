package com.sample.queue;

public interface Queue {

    public void push(Object o);
    public Object element();
    public Object peek();
    public Object poll();

}
