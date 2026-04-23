package io.github.SavioRomario10.arquiteturaspring.montadora;

import io.github.SavioRomario10.arquiteturaspring.montadora.enums.Montadora;

public class Chave {
  private Montadora montadora;
  private String tipo;
  
  public Montadora getMontadora() {
    return montadora;
  }
  public void setMontadora(Montadora montadora) {
    this.montadora = montadora;
  }
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
}