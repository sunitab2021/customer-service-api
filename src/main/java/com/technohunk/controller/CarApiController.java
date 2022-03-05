package com.technohunk.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
//import java.sql.Timestamp;
//import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.technohunk.dao.entity.CarEntity;
import com.technohunk.dao.entity.CustomerEntity;
//import com.technohunk.dao.entity.CarEntity;
//import com.technohunk.dao.entity.CustomerRepository;
import com.technohunk.dto.CarDTO;
import com.technohunk.dto.CustomerDTO;
import com.technohunk.mapper.CarMapper;
//import com.technohunk.dto.CustomerDTO;
//import com.technohunk.dto.CustomerDTO;
import com.technohunk.service.CarService;
import com.technohunk.service.CustomerService;
//import com.technohunk.service.CustomerService;
//import com.technohunk.service.CustomerService;

@RestController
@RequestMapping("/v1")
//singleton ,prototype, request,session,application,socket,global-session
@Scope("singleton")
public class CarApiController {
	
	@Autowired
	private CarService carService;
	
	@Autowired
	private CustomerService customerService;
	
	@PutMapping("/cars")
	@ResponseStatus(HttpStatus.OK)
	public String updateCar(@RequestBody CarDTO carDTO) {
		//carDTO.setCreatedate(new Timestamp(new Date().getTime()));
		//carDTO.setUpdateddate(new Timestamp(new Date().getTime()));
		carService.updateById(carDTO);
		return "updated";
	}
	
	@PostMapping("/cars")
	@ResponseStatus(HttpStatus.CREATED)
	public String createCars(@RequestBody CarDTO carDTO) {
		//customerDTO.setCreatedate(new Timestamp(new Date().getTime()));
		//customerDTO.setUpdateddate(new Timestamp(new Date().getTime()));
		carService.save(carDTO);
		return "created";
		
	}
	
	@GetMapping("/cars")
	@ResponseStatus(HttpStatus.OK)
	public List<CarDTO> getAllCars(){
		
		List<CarDTO> carDTOs = carService.findAll();
		return carDTOs;
	}
	
	@GetMapping("/cars/{rid}")
	@ResponseStatus(HttpStatus.OK)
	public CarDTO getCar(@PathVariable int rid) {
		CarDTO carDTO = carService.findById(rid);
		return carDTO;
	}
	
	@DeleteMapping("cars/{rid}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteCustomer(@PathVariable int rid) {
		carService.deleteById(rid);
	}

}
