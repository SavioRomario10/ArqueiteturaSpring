package io.github.SavioRomario10.arquiteturaspring.todos.services;

import org.springframework.stereotype.Service;

import io.github.SavioRomario10.arquiteturaspring.todos.TodoEntity;
import io.github.SavioRomario10.arquiteturaspring.todos.repository.TodoRepository;

@Service//anota a classe como um servico
public class TodoService {

  private TodoRepository repository;

  public TodoService(TodoRepository repository) {
    this.repository = repository;
  }

  public TodoEntity salvar(TodoEntity novoTodo) {
    return repository.save(novoTodo);
  }

  public void atualizarStatus(TodoEntity todo) {
    repository.save(todo);
  }
}