package br.com.elwgomes.repository;

import java.util.List;

import br.com.elwgomes.domain.AnimalDomain;

public interface AnimalRepository {
  AnimalDomain createAnimal(AnimalDomain animalDomain);

  List<AnimalDomain> getAllAnimals();
}
