package com.technohunk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/payment")
@RestController
public class PaymentController {
	
	
	@GetMapping("/process/{pid}")
	@ResponseStatus(HttpStatus.CREATED)
	@PreAuthorize("hasRole('ROLE_USER')")
	public PaymentDTO processPayment(@PathVariable int pid) {
		PaymentDTO paymentDTO=new PaymentDTO();
		paymentDTO.setMessage("Hey! your payment is processed successfully!");
		paymentDTO.setPid(pid);
		paymentDTO.setTotal(8102);
		return paymentDTO;
	}
	

}
