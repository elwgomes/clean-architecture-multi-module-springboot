package br.com.elwgomes.ports.contract.createAnimal;

import br.com.elwgomes.domain.AnimalDomain;
import br.com.elwgomes.exception.InvalidAnimalDataException;

public interface CreateAnimalCommand {
  AnimalDomain execute(AnimalDomain animalDomain) throws InvalidAnimalDataException;
}
