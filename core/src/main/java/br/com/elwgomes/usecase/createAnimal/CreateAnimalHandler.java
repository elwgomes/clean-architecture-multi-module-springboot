package br.com.elwgomes.usecase.createAnimal;

import br.com.elwgomes.domain.AnimalDomain;
import br.com.elwgomes.ports.contract.createAnimal.CreateAnimalCommand;
import br.com.elwgomes.ports.spi.AnimalDatabasePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateAnimalHandler implements CreateAnimalCommand {

  private final AnimalDatabasePort databasePort;

  @Override
  public AnimalDomain execute(AnimalDomain animalDomain) {
    return databasePort.createAnimal(animalDomain);
  }

}
