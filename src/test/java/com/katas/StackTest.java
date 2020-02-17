package com.katas;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class StackTest {
  @Test
  public void empty() throws Throwable {
    Stack stack = new Stack();

    assertThat(stack.size(), equalTo(0));
  }

  @Test
  public void push() throws Throwable {
    Stack stack = new Stack();

    stack.push(3);
    assertThat(stack.size(), equalTo(1));

    stack.push(4);
    assertThat(stack.size(), equalTo(2));
  }

  @Test
  public void pop() throws Throwable {
    Stack stack = new Stack();

    stack.push(3);
    stack.push(4);

    assertThat(stack.pop(), equalTo(4));
    assertThat(stack.size(), equalTo(1));

    assertThat(stack.pop(), equalTo(3));
    assertThat(stack.size(), equalTo(0));
  }
}
