package br.com.elwgomes.controller.animal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.elwgomes.controller.animal.request.AnimalRequest;
import br.com.elwgomes.controller.animal.response.AnimalResponse;
import br.com.elwgomes.mapper.AnimalMapper;
import br.com.elwgomes.ports.contract.createAnimal.CreateAnimalCommand;

@RestController
@RequestMapping("api/v1/animals")
public class AnimalController {

  private final CreateAnimalCommand command;

  @Autowired
  public AnimalController(CreateAnimalCommand command) {
    this.command = command;
    System.out.println("CreateAnimalCommand injected: " + (command != null));
  }

  @PostMapping
  public ResponseEntity<AnimalResponse> postMethodName(@RequestBody AnimalRequest request) {
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(AnimalMapper.INSTANCE.domainToResponse(command.execute(AnimalMapper.INSTANCE.requestToDomain(request))));
  }
}
