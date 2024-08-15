package br.com.elwgomes.ports.spi;

import java.util.List;

import br.com.elwgomes.domain.AnimalDomain;
import br.com.elwgomes.exception.InvalidAnimalDataException;

public interface AnimalDatabasePort {
  AnimalDomain createAnimal(AnimalDomain animalDomain) throws InvalidAnimalDataException;

  List<AnimalDomain> getAllAnimals();
}
