package com.katas;

import java.util.EmptyStackException;

public class Stack<E> {
  private int size;
  private E[] items = (E[])new Object[3];

  public void push(E value) {
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
