package br.com.elwgomes.persistence;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.elwgomes.entity.AnimalEntity;

@Repository
public interface AnimalPersistence extends JpaRepository<AnimalEntity, UUID> {
}
