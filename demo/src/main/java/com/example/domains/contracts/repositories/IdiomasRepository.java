package com.example.domains.contracts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.domains.entities.Language;

@RepositoryRestResource(path="idiomas", itemResourceRel="idioma", collectionResourceRel="idiomas")
public interface IdiomasRepository extends JpaRepository<Language, Integer> {

}
