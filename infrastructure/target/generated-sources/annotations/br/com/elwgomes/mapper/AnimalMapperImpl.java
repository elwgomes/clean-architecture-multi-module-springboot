package br.com.elwgomes.mapper;

import br.com.elwgomes.controller.animal.request.AnimalRequest;
import br.com.elwgomes.controller.animal.response.AnimalResponse;
import br.com.elwgomes.domain.AnimalDomain;
import br.com.elwgomes.entity.AnimalEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-15T12:03:19-0300",
    comments = "version: 1.6.0, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.2 (Oracle Corporation)"
)
public class AnimalMapperImpl implements AnimalMapper {

    @Override
    public AnimalDomain requestToDomain(AnimalRequest request) {
        if ( request == null ) {
            return null;
        }

        AnimalDomain.AnimalDomainBuilder animalDomain = AnimalDomain.builder();

        animalDomain.name( request.getName() );
        animalDomain.tutor( request.getTutor() );

        return animalDomain.build();
    }

    @Override
    public AnimalResponse domainToResponse(AnimalDomain domain) {
        if ( domain == null ) {
            return null;
        }

        AnimalResponse.AnimalResponseBuilder animalResponse = AnimalResponse.builder();

        animalResponse.name( domain.getName() );
        animalResponse.tutor( domain.getTutor() );

        return animalResponse.build();
    }

    @Override
    public AnimalResponse entityToResponse(AnimalEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AnimalResponse.AnimalResponseBuilder animalResponse = AnimalResponse.builder();

        animalResponse.name( entity.getName() );
        animalResponse.tutor( entity.getTutor() );

        return animalResponse.build();
    }

    @Override
    public AnimalEntity domainToEntity(AnimalDomain domain) {
        if ( domain == null ) {
            return null;
        }

        AnimalEntity animalEntity = new AnimalEntity();

        animalEntity.setId( domain.getId() );
        animalEntity.setName( domain.getName() );
        animalEntity.setTutor( domain.getTutor() );

        return animalEntity;
    }

    @Override
    public AnimalDomain entityToDomain(AnimalEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AnimalDomain.AnimalDomainBuilder animalDomain = AnimalDomain.builder();

        animalDomain.id( entity.getId() );
        animalDomain.name( entity.getName() );
        animalDomain.tutor( entity.getTutor() );

        return animalDomain.build();
    }
}
