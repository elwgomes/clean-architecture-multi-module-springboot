package br.com.elwgomes.adapter;

import br.com.elwgomes.domain.AnimalDomain;
import br.com.elwgomes.ports.spi.AnimalDatabasePort;
import br.com.elwgomes.repository.AnimalRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AnimalDatabaseAdapter implements AnimalDatabasePort {

  private final AnimalRepository animalRepository;

  @Override
  public AnimalDomain createAnimal(AnimalDomain animalDomain) {
    return animalRepository.createAnimal(animalDomain);
  }

}
