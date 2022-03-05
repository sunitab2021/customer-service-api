package com.technohunk.service;

import java.util.List;

import com.technohunk.dto.PaymentDTO;

public interface PaymentService {
	
	void save(PaymentDTO paymentDTO);

	PaymentDTO findById(int pid);

	void deleteById(int pid);

	void update(PaymentDTO paymentDTO);

	List<PaymentDTO> findAllPayments();

}
