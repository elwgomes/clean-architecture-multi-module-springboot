package br.com.elwgomes.controller.animal.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AnimalResponse {
  private String name;
  private String tutor;
}
