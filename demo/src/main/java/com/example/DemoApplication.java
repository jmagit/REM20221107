package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;

import com.example.domains.contracts.repositories.ActorRepository;
import com.example.domains.entities.Actor;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	ActorRepository dao;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Aplicacion arrancada");
		
//		dao.findAll().forEach(System.out::println);
//		var item = dao.findById(214);
//		if(item.isPresent()) {
//			System.out.println(item.get());
//			item.get().setFirstName(item.get().getFirstName().toUpperCase());
//			dao.save(item.get());
//		} else {
//			System.out.println("No encontrado");
//		}
//		dao.save(new Actor(214, "Carmelo", "COTON"));
//		dao.deleteById(213);
//		dao.findAll().forEach(System.out::println);
//		dao.findTop5ByFirstNameStartingWithOrderByLastNameDesc("P").forEach(System.out::println);
//		dao.findTop5ByFirstNameStartingWith("P", Sort.by("firstName")).forEach(System.out::println);
		dao.findByActorIdGreaterThan(200).forEach(System.out::println);
		dao.findNovedadesJPQL(200).forEach(System.out::println);
		dao.findNovedadesSQL(200).forEach(System.out::println);
		dao.findAll((root, query, builder) -> builder.lessThan(root.get("actorId"), 5)).forEach(System.out::println);
	}

}
