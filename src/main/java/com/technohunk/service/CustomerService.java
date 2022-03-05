package com.technohunk.service;

import java.util.List;

//import com.technohunk.dto.CarDTO;
import com.technohunk.dto.CustomerDTO;

public interface CustomerService {

	void save(CustomerDTO customerDTO);

	CustomerDTO findById(int cid);

	void deleteById(int cid);

	void update(CustomerDTO customerDTO);

	List<CustomerDTO> findAll();

}
