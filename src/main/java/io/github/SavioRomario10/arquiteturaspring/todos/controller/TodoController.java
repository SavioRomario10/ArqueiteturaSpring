package io.github.SavioRomario10.arquiteturaspring.todos.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.SavioRomario10.arquiteturaspring.todos.TodoEntity;
import io.github.SavioRomario10.arquiteturaspring.todos.services.TodoService;

@RestController//Indica que essa classe é um controller
@RequestMapping("/todos")//Indica o caminho para o controller
public class TodoController {

  private TodoService service;

  public TodoController(TodoService service) {
    this.service = service;
  }

  @PostMapping//mapeamento
  public TodoEntity salvar(@RequestBody TodoEntity todo){
    return this.service.salvar(todo);
  }
}
