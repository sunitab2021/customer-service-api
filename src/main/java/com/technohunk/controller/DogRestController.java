package com.technohunk.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class DogRestController {
	
	
	@GetMapping("/dog")
	public DogDTO findDog() {
		DogDTO dogDTO=new DogDTO();
		dogDTO.setColor("yellow");
		dogDTO.setName("tommy");
		return dogDTO;
	}
	
	@GetMapping("/dogs")
	@PreAuthorize("hasRole('ROLE_USER')")
	public DogDTO findDogs() {
		DogDTO dogDTO=new DogDTO();
		dogDTO.setColor("yellow");
		dogDTO.setName("tommy");
		return dogDTO;
	}
	

}
