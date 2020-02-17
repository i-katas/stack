package com.katas;

import java.util.EmptyStackException;

public class Stack<E> {
  private int size;
  private final E[] items;

  public Stack(int capacity) {
    this.items = (E[])new Object[capacity];
  }

  public void push(E value) {
    if(size >= items.length) {
      throw new IllegalStateException("Stack capacity is full: " + items.length);
    }
    items[size++] = value;
  }

  public E pop() {
    if(size == 0) {
      throw new EmptyStackException();
    }
    return items[--size];
  }
  
  public int size() {
    return size;
  }

}
