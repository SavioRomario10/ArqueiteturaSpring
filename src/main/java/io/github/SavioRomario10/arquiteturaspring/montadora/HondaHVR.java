package io.github.SavioRomario10.arquiteturaspring.montadora;

import io.github.SavioRomario10.arquiteturaspring.montadora.enums.Color;
import io.github.SavioRomario10.arquiteturaspring.montadora.enums.Montadora;

public class HondaHVR extends Carro{

  public HondaHVR(Motor motor) {
    super(motor);
    setModelo("HRV");
    setColor(Color.BLACK);
    setMontadora(Montadora.HONDA);
  }
}
