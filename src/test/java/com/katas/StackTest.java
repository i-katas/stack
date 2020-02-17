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
}
