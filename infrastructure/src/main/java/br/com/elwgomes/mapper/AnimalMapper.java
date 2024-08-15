package br.com.elwgomes.mapper;

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

  AnimalEntity domainToEntity(AnimalDomain domain);

  AnimalDomain entityToDomain(AnimalEntity entity);

}
