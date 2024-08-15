package br.com.elwgomes.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.elwgomes.domain.AnimalDomain;
import br.com.elwgomes.mapper.AnimalMapper;
import br.com.elwgomes.persistence.AnimalPersistence;

@Component
public class AnimalRepositoryImpl implements AnimalRepository {

  @Autowired
  private AnimalPersistence persistence;

  @Override
  public AnimalDomain createAnimal(AnimalDomain animalDomain) {
    return AnimalMapper.INSTANCE.entityToDomain(persistence.save(AnimalMapper.INSTANCE.domainToEntity(animalDomain)));
  }

  @Override
  public List<AnimalDomain> getAllAnimals() {
    return AnimalMapper.INSTANCE.entityListToDomainList(persistence.findAll());
  }

}
