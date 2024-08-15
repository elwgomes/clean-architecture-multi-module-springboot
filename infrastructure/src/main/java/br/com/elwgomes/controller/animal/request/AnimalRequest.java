package br.com.elwgomes.controller.animal.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AnimalRequest {
  private String name;
  private String tutor;
}
