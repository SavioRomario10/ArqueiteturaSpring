package io.github.SavioRomario10.arquiteturaspring.montadora.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.github.SavioRomario10.arquiteturaspring.montadora.*;

@RestController
public class TesteFabricaController {

  @Autowired
  private Motor motor;

  @PostMapping  
  public CarroStatus ligarCarro(@RequestBody Chave chave){
    var carro = new HondaHVR(motor);

    return carro.darIgnicao(chave);
  }
}
