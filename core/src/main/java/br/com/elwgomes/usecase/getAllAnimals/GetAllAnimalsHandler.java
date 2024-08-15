package br.com.elwgomes.usecase.getAllAnimals;

import java.util.List;

import br.com.elwgomes.domain.AnimalDomain;
import br.com.elwgomes.ports.contract.getAllAnimals.GetAllAnimalsCommand;
import br.com.elwgomes.ports.spi.AnimalDatabasePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GetAllAnimalsHandler implements GetAllAnimalsCommand {

  private final AnimalDatabasePort databasePort;

  @Override
  public List<AnimalDomain> execute() {
    return databasePort.getAllAnimals();
  }

}
