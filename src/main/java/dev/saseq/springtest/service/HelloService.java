package dev.saseq.springtest.service;

import org.springframework.stereotype.Service;

/** A service for greeting. */
@Service
public class HelloService {

  public String getHello() {
    return "hello world";
  }
}
