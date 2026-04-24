package io.github.SavioRomario10.arquiteturaspring.todos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//anota a classe para uma entidade
@Table(name = "tb_todo")//define a tabela
public class TodoEntity {

  @Id//anota o id
  @Column(name="id")//define o coluna
  @GeneratedValue(strategy = GenerationType.IDENTITY)//define a estrategia de geracao
  private Integer id;
  @Column(name = "descricao")
  private String descricao;
  @Column(name = "fl_concluido")
  private Boolean concluido;

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public Boolean getConcluido() {
    return concluido;
  }
  public void setConcluido(Boolean concluido) {
    this.concluido = concluido;
  }  
}