package com.technohunk.service;

import java.util.List;

import com.technohunk.dto.CarDTO;

public interface CarService {

	void save(CarDTO carDTO);

	CarDTO findById(int cid);

	void deleteById(int cid);

	void updateById(CarDTO carDTO);

	List<CarDTO> findAllCars(int cid);

	List<CarDTO> findAll();

}
