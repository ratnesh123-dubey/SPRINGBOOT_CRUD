package com.example.rd.springcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rd.springcrud.models.Characters;
import com.example.rd.springcrud.repositories.SuperheroCharacterRepository;

@Service
public class CRUDService {
	
	@Autowired
	SuperheroCharacterRepository superheroCharacterRepository;
	public void createSuperhero(Characters character) {
		
		superheroCharacterRepository.save(character);
	}
	
	public Characters readSuperHeroById(int val) {
		// TODO Auto-generated method stub
		return superheroCharacterRepository.findById(val).get();
	}
	
	
public void updateSuperHeroHumanName(Characters superhero, int id) {
		
		Characters superheroToBeUpdated = readSuperHeroById(id);
		
		superheroToBeUpdated.setHumanName(superhero.getHumanName());
		
		superheroCharacterRepository.save(superheroToBeUpdated);
		
	}




	public void deleteSuperHero(int id) {
		// TODO Auto-generated method stub
		superheroCharacterRepository.deleteById(id);
	}
	
	
	
	
	
	
	
	

}
