package br.com.elwgomes.ports.spi;

import br.com.elwgomes.domain.AnimalDomain;

public interface AnimalDatabasePort {
  AnimalDomain createAnimal(AnimalDomain animalDomain);
}
