package br.com.elwgomes.adapter;

import java.util.List;

import br.com.elwgomes.domain.AnimalDomain;
import br.com.elwgomes.exception.InvalidAnimalDataException;
import br.com.elwgomes.ports.spi.AnimalDatabasePort;
import br.com.elwgomes.repository.AnimalRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AnimalDatabaseAdapter implements AnimalDatabasePort {

  private final AnimalRepository animalRepository;

  @Override
  public AnimalDomain createAnimal(AnimalDomain animalDomain) throws InvalidAnimalDataException {
    if (animalDomain.getName() == null || animalDomain.getName().isEmpty()) {
      throw new InvalidAnimalDataException("Animal name cannot be empty");
    }
    return animalRepository.createAnimal(animalDomain);
  }

  @Override
  public List<AnimalDomain> getAllAnimals() {
    return animalRepository.getAllAnimals();
  }

}
