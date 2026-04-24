package io.github.SavioRomario10.arquiteturaspring.todos.repository;

import io.github.SavioRomario10.arquiteturaspring.todos.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//anota a classe como um repositorio
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {

}
