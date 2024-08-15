package br.com.elwgomes.ports.contract.createAnimal;

import br.com.elwgomes.domain.AnimalDomain;

public interface CreateAnimalCommand {
  AnimalDomain execute(AnimalDomain animalDomain);
}
