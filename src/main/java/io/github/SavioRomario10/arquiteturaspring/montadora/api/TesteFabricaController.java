package io.github.SavioRomario10.arquiteturaspring.montadora.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import io.github.SavioRomario10.arquiteturaspring.montadora.*;

@RestController // configura como controlador
@RequestMapping("/carros") //define a url
public class TesteFabricaController {

  @Autowired //injeta a dependencia
  @Qualifier("Eletrico") //define qual dependencia injetar
  private Motor motor;

  @PostMapping  //define o mapeamento
  public CarroStatus ligarCarro(@RequestBody Chave chave){//define que o corpo da requisição sera convertido
    var carro = new HondaHVR(motor);

    return carro.darIgnicao(chave);
  }
}
