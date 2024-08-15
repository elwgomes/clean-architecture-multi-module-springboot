package br.com.elwgomes.repository;

import br.com.elwgomes.domain.AnimalDomain;

public interface AnimalRepository {
  AnimalDomain createAnimal(AnimalDomain animalDomain);
}
