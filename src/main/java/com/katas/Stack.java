package com.katas;

import java.util.EmptyStackException;

public class Stack {
  private int size;
  private int[] items = new int[3];

  public void push(int value) {
    items[size++] = value;
  }

  public int pop() {
    if(size == 0) {
      throw new EmptyStackException();
    }
    return items[--size];
  }
  
  public int size() {
    return size;
  }

}
