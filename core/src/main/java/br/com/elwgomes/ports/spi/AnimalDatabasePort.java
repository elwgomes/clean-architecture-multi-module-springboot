package br.com.elwgomes.ports.spi;

import java.util.List;

import br.com.elwgomes.domain.AnimalDomain;

public interface AnimalDatabasePort {
  AnimalDomain createAnimal(AnimalDomain animalDomain);

  List<AnimalDomain> getAllAnimals();
}
