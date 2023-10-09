package br.com.vittor.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraControlle {

  @GetMapping("/")
  public String primeiraMensagem() {
    return "funcionou";
  } 
}
