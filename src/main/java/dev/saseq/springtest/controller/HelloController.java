package dev.saseq.springtest.controller;

import dev.saseq.springtest.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** A controller for handling hello requests. */
@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HelloController {

  private final HelloService helloService;

  @GetMapping
  public ResponseEntity<String> getHello() {
    return ResponseEntity.ok(helloService.getHello());
  }
}
