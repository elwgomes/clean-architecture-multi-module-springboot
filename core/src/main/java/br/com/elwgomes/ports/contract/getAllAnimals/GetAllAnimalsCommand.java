package br.com.elwgomes.ports.contract.getAllAnimals;

import java.util.List;

import br.com.elwgomes.domain.AnimalDomain;

public interface GetAllAnimalsCommand {
  List<AnimalDomain> execute();
}
