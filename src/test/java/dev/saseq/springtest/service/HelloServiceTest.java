package dev.saseq.springtest.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/** Tests for HelloService. */
class HelloServiceTest {

  private final HelloService helloService = new HelloService();

  @Test
  void shouldReturnHelloWorld() {
    // given
    String expected = "hello world";

    // when
    String actual = helloService.getHello();

    // then
    assertEquals(expected, actual);
  }
}
