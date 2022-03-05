package com.technohunk.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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

import com.technohunk.dto.CarDTO;
import com.technohunk.dto.CustomerDTO;
import com.technohunk.service.CustomerService;

@RestController
@RequestMapping("/v1")
//singleton ,prototype, request,session,application,socket,global-session
@Scope("singleton")
public class CustomerApiController {
	
	@Autowired
	private CustomerService customerService;
	
	@PutMapping("/customers")
	@ResponseStatus(HttpStatus.OK)
	public String updateCustomers(@RequestBody CustomerDTO customerDTO) {
		customerDTO.setCreatedate(new Timestamp(new Date().getTime()));
		customerDTO.setUpdateddate(new Timestamp(new Date().getTime()));
		customerService.update(customerDTO);
		return "updated";
	}
	
	@PostMapping("/customers")
	@ResponseStatus(HttpStatus.CREATED)
	public String createCustomers(@RequestBody CustomerDTO customerDTO) {
		customerDTO.setCreatedate(new Timestamp(new Date().getTime()));
		customerDTO.setUpdateddate(new Timestamp(new Date().getTime()));
		customerService.save(customerDTO);
		return "created";
	}
	
	@GetMapping("/customers")
	@ResponseStatus(HttpStatus.OK)
	public List<CustomerDTO> getCustomers(){
		List<CustomerDTO> customerDTOs = customerService.findAll();
		return customerDTOs;
	}
	@GetMapping("/customers/{cid}")
	@ResponseStatus(HttpStatus.OK)
	public CustomerDTO getCustomer(@PathVariable int cid) {
		CustomerDTO customerDTO = customerService.findById(cid);
		return customerDTO;
	}
	
	@DeleteMapping("customers/{cid}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteCustomer(@PathVariable int cid) {
		customerService.deleteById(cid);
	}
	
	}
	
	
