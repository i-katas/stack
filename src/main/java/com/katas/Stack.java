package com.katas;

public class Stack {
  private int size;
  private int[] items = new int[3];

  public void push(int value) {
    items[size++] = value;
  }

  public int pop() {
    return items[--size];
  }
  
  public int size() {
    return size;
  }

}
