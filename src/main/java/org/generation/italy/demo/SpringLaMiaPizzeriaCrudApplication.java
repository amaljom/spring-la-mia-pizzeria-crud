package org.generation.italy.demo;

import java.util.List;

import org.generation.italy.demo.pojo.Drink;
import org.generation.italy.demo.pojo.Pizza;
import org.generation.italy.demo.service.DrinkService;
import org.generation.italy.demo.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLaMiaPizzeriaCrudApplication implements CommandLineRunner {
	
	@Autowired
	private DrinkService drinkService;
	
	@Autowired
	private PizzaService pizzaService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Pizza b1 = new Pizza("rossa", "pomodori", 10);
		Pizza b2 = new Pizza("bianca", "rosamrino", 5);
		Pizza b3 = new Pizza("boscaiola", "funghi e salsiccia", 13);
		Pizza b4 = new Pizza("napoli", "alici", 10);
		
		pizzaService.save(b1);
		pizzaService.save(b2);
		pizzaService.save(b3);
		pizzaService.save(b4);
		
		
		List<Pizza> pizze = pizzaService.findAll();
		System.out.println(pizze);
		
		Drink d1 = new Drink("mojito", "bho", 10);
		Drink d2 = new Drink("altro", "rosamrino", 5);
		Drink d3 = new Drink("rum&cola", "cola", 13);
		
		drinkService.save(d1);
		drinkService.save(d2);
		drinkService.save(d3);
		
		List<Drink> drinks = drinkService.findAll();
		System.out.println(drinks);
		
	}
	
	
	

}
