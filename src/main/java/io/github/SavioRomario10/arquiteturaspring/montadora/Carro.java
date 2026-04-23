package io.github.SavioRomario10.arquiteturaspring.montadora;

import io.github.SavioRomario10.arquiteturaspring.montadora.enums.Color;
import io.github.SavioRomario10.arquiteturaspring.montadora.enums.Montadora;

public class Carro {
  private String modelo;
  private Color color;
  private Motor motor;
  private Montadora montadora;

  public Carro(Motor motor) {
    this.motor = motor;
  }
  public CarroStatus darIgnicao(Chave chave) {
    if(chave.getMontadora() != this.getMontadora()){
      return new CarroStatus("Não é possivel iniciar carro com essa chave");
    } else {
      return new CarroStatus("Carro ligado. Rodando com o motor " + motor);
    }
  }
  public String getModelo() {
    return modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public Color getColor() {
    return color;
  }
  public void setColor(Color color) {
    this.color = color;
  }
  public Motor getMotor() {
    return motor;
  }
  public void setMotor(Motor motor) {
    this.motor = motor;
  }
  public Montadora getMontadora() {
    return montadora;
  }
  public void setMontadora(Montadora montadora) {
    this.montadora = montadora;
  }
}
