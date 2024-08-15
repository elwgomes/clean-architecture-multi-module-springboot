package br.com.elwgomes.controller.animal;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.elwgomes.controller.animal.request.AnimalRequest;
import br.com.elwgomes.controller.animal.response.AnimalResponse;
import br.com.elwgomes.exception.InvalidAnimalDataException;
import br.com.elwgomes.mapper.AnimalMapper;
import br.com.elwgomes.ports.contract.createAnimal.CreateAnimalCommand;
import br.com.elwgomes.ports.contract.getAllAnimals.GetAllAnimalsCommand;

@RestController
@RequestMapping("api/v1/animals")
public class AnimalController {

  private final CreateAnimalCommand createAnimalCommand;
  private final GetAllAnimalsCommand getAllAnimalsCommand;

  public AnimalController(CreateAnimalCommand createAnimalCommand, GetAllAnimalsCommand getAllAnimalsCommand) {
    this.createAnimalCommand = createAnimalCommand;
    this.getAllAnimalsCommand = getAllAnimalsCommand;
  }

  @PostMapping
  public ResponseEntity<AnimalResponse> postMethodName(@RequestBody AnimalRequest request)
      throws InvalidAnimalDataException {
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(AnimalMapper.INSTANCE
            .domainToResponse(createAnimalCommand.execute(AnimalMapper.INSTANCE.requestToDomain(request))));
  }

  @GetMapping
  public ResponseEntity<List<AnimalResponse>> getMethodName() {
    return ResponseEntity.status(HttpStatus.OK)
        .body(AnimalMapper.INSTANCE.domainListToResponseList(getAllAnimalsCommand.execute()));
  }
}
