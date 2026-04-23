package io.github.SavioRomario10.arquiteturaspring.montadora.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.SavioRomario10.arquiteturaspring.montadora.Motor;
import io.github.SavioRomario10.arquiteturaspring.montadora.enums.TipoMotor;

@Configuration
public class MontadoraConfiguration {

  @Bean
  public Motor motor() {

    var motor = new Motor();
    
    motor.setCavalos(120);
    motor.setCilindros(4);
    motor.setModelo("XPTO-0");
    motor.setLitragem(2.0);
    motor.setTipo(TipoMotor.ASPIRADO);

    return motor;
  }
}
