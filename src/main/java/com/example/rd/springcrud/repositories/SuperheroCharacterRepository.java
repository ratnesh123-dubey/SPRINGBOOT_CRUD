package com.example.rd.springcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rd.springcrud.models.Characters;

@Repository
public interface SuperheroCharacterRepository extends JpaRepository<Characters, Integer> {

}
