package br.com.elwgomes.mapper;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.elwgomes.controller.animal.request.AnimalRequest;
import br.com.elwgomes.controller.animal.response.AnimalResponse;
import br.com.elwgomes.domain.AnimalDomain;
import br.com.elwgomes.entity.AnimalEntity;

@Mapper
public interface AnimalMapper {

  AnimalMapper INSTANCE = Mappers.getMapper(AnimalMapper.class);

  AnimalDomain requestToDomain(AnimalRequest request);

  AnimalResponse domainToResponse(AnimalDomain domain);

  AnimalResponse entityToResponse(AnimalEntity entity);

  AnimalEntity domainToEntity(AnimalDomain domain);

  AnimalDomain entityToDomain(AnimalEntity entity);

  default List<AnimalDomain> entityListToDomainList(List<AnimalEntity> entityList) {
    List<AnimalDomain> domainList = new ArrayList<>();
    for (AnimalEntity el : entityList) {
      domainList.add(entityToDomain(el));
    }
    return domainList;
  }

  default List<AnimalResponse> domainListToResponseList(List<AnimalDomain> domainList) {
    List<AnimalResponse> responseList = new ArrayList<>();
    domainList.forEach(dl -> responseList.add(domainToResponse(dl)));
    return responseList;
  }

}
