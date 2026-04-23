package io.github.SavioRomario10.arquiteturaspring.montadora.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.SavioRomario10.arquiteturaspring.montadora.Motor;
import io.github.SavioRomario10.arquiteturaspring.montadora.enums.TipoMotor;

@Configuration//define uma classe de configuração
public class MontadoraConfiguration {

  @Bean(name = "Aspirado")//define que um bean ser injetado
  public Motor motorAspirado() {

    var motor = new Motor();
    
    motor.setCavalos(120);
    motor.setCilindros(4);
    motor.setModelo("XPTO-0");
    motor.setLitragem(2.0);
    motor.setTipo(TipoMotor.ASPIRADO);

    return motor;
  }

  @Bean(name = "Eletrico")
  public Motor motorEletrico() {

    var motor = new Motor();
    
    motor.setCavalos(110);
    motor.setCilindros(3);
    motor.setModelo("BH30");
    motor.setLitragem(1.5);
    motor.setTipo(TipoMotor.ELETRICO);

    return motor;
  }

  @Bean(name = "Turbo")
  public Motor motorTurbo() {

    var motor = new Motor();
    
    motor.setCavalos(180);
    motor.setCilindros(8);
    motor.setModelo("XPTO-4");
    motor.setLitragem(1.5);
    motor.setTipo(TipoMotor.TURBO);

    return motor;
  }
}
