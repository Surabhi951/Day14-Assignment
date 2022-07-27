package com.bridgelabz;

public class Stack<T extends Comparable<T>> {

    LinkedList<T> linkedList;

    public Stack() {
        this.linkedList = new LinkedList<>();
    }


    public void push(T key) {
        linkedList.push(key);
    }

    void print(){
        linkedList.print();
    }

    public T pop() {
        return linkedList.pop();
    }

}

