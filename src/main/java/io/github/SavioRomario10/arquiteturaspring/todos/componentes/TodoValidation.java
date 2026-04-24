package io.github.SavioRomario10.arquiteturaspring.todos.componentes;

import org.springframework.stereotype.Component;

import io.github.SavioRomario10.arquiteturaspring.todos.TodoEntity;
import io.github.SavioRomario10.arquiteturaspring.todos.repository.TodoRepository;

@Component
public class TodoValidation {

  private TodoRepository repository;

  public TodoValidation(TodoRepository repository) {
    this.repository = repository;
  }
  public void validar(TodoEntity todo){
    if(existeTodoComMesmaDescricao(todo.getDescricao())){
      throw new IllegalArgumentException("Já existe um todo com a mesma descrição");
    }
  }

  private boolean existeTodoComMesmaDescricao(String descricao){
    return repository.existsByDescricao(descricao);
  }
}
