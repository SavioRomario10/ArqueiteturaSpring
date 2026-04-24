package io.github.SavioRomario10.arquiteturaspring.todos.services;

import org.springframework.stereotype.Service;

import io.github.SavioRomario10.arquiteturaspring.todos.TodoEntity;
import io.github.SavioRomario10.arquiteturaspring.todos.componentes.MailSender;
import io.github.SavioRomario10.arquiteturaspring.todos.componentes.TodoValidation;
import io.github.SavioRomario10.arquiteturaspring.todos.repository.TodoRepository;

@Service//anota a classe como um servico
public class TodoService {

  private TodoRepository repository;
  private TodoValidation todoValidation;
  private MailSender mailSender;

  public TodoService(TodoRepository repository, TodoValidation todoValidation, MailSender mailSender) {
    this.repository = repository;
    this.todoValidation = todoValidation;
    this.mailSender = mailSender;
  }

  public TodoEntity salvar(TodoEntity novoTodo) {
    todoValidation.validar(novoTodo);
    return repository.save(novoTodo);
  }

  public void atualizarStatus(TodoEntity todo) {
    repository.save(todo);
    String status = todo.getConcluido() == Boolean.TRUE ? "Concluido" : "Não concluido";
    mailSender.enviar("Todo com a descricao " + todo.getDescricao() + " foi " + status);
  }

  public TodoEntity buscarPorId(Integer id){
    return repository.findById(id).orElse(null);
  }

  public void excluir(Integer id){
    repository.deleteById(id);
  }
}