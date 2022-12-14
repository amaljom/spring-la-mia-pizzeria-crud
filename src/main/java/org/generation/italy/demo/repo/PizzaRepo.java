package org.generation.italy.demo.repo;

import java.util.List;

import org.generation.italy.demo.pojo.Drink;
import org.generation.italy.demo.pojo.Pizza;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PizzaRepo extends JpaRepository<Pizza, Integer>{
	
	public List<Pizza> findByNomeContainingIgnoreCase(String nome);
}
