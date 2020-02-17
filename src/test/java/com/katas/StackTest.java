package com.katas;

import org.junit.Test;
import java.util.EmptyStackException;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.equalTo;

public class StackTest {
  private final Stack<Integer> stack = new Stack<>(2);

  @Test
  public void empty() throws Throwable {
    assertThat(stack.size(), equalTo(0));
  }

  @Test
  public void push() throws Throwable {
    stack.push(3);
    assertThat(stack.size(), equalTo(1));

    stack.push(4);
    assertThat(stack.size(), equalTo(2));
  }

  @Test
  public void pop() throws Throwable {
    stack.push(3);
    stack.push(4);

    assertThat(stack.pop(), equalTo(4));
    assertThat(stack.size(), equalTo(1));

    assertThat(stack.pop(), equalTo(3));
    assertThat(stack.size(), equalTo(0));
  }

  @Test
  public void throwsEmptyStackExceptionWhenPopItemFromAnEmptyStack() throws Throwable {
    try {
      stack.pop();
      fail();
    } catch(EmptyStackException expected) {
      assertThat(stack.size(), equalTo(0));
    }
  }

  @Test
  public void throwsExceptionWhenPushItemInAFullStack() throws Throwable {
    stack.push(1);
    stack.push(2);

    try {
      stack.push(3);
      fail();
    } catch(IllegalStateException expected) {
      assertThat(expected.getMessage(), equalTo("Stack capacity is full: 2"));
      assertThat(stack.size(), equalTo(2));
    }
  }
}
