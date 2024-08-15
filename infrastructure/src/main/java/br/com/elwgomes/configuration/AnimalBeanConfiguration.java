package br.com.elwgomes.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.elwgomes.adapter.AnimalDatabaseAdapter;
import br.com.elwgomes.ports.contract.createAnimal.CreateAnimalCommand;
import br.com.elwgomes.ports.contract.getAllAnimals.GetAllAnimalsCommand;
import br.com.elwgomes.ports.spi.AnimalDatabasePort;
import br.com.elwgomes.repository.AnimalRepository;
import br.com.elwgomes.usecase.createAnimal.CreateAnimalHandler;
import br.com.elwgomes.usecase.getAllAnimals.GetAllAnimalsHandler;

@Configuration
public class AnimalBeanConfiguration {

  @Bean
  AnimalDatabasePort animalDatabasePort(AnimalRepository animalRepository) {
    return new AnimalDatabaseAdapter(animalRepository);
  }

  @Bean
  CreateAnimalCommand createAnimalCommand(AnimalDatabasePort animalDatabasePort) {
    return new CreateAnimalHandler(animalDatabasePort);
  }

  @Bean
  GetAllAnimalsCommand getAllAnimalsCommand(AnimalDatabasePort animalDatabasePort) {
    return new GetAllAnimalsHandler(animalDatabasePort);
  }

}
