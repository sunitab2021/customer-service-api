package com.technohunk.service.impl;

//import java.sql.Timestamp;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

//import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technohunk.dao.entity.CarEntity;
import com.technohunk.dao.entity.CustomerEntity;
import com.technohunk.dao.CarRepository;
import com.technohunk.dao.CustomerRepository;
import com.technohunk.dto.CarDTO;
import com.technohunk.dto.CustomerDTO;
import com.technohunk.mapper.CarMapper;
import com.technohunk.mapper.CustomerMapper;
import com.technohunk.service.CarService;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	CarRepository carRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public void save(CarDTO carDTO) {
		
		CustomerEntity customerEntity=customerRepository.findById(carDTO.getRid()).get();
		
		CarEntity carEntity=new CarEntity();
		//actorsEntity.setName(actorDTO.getName());
		//actorsEntity.setPhoto(actorDTO.getPhoto());
		//actorsEntity.setRole(actorDTO.getRole());
		//actorsEntity.setCreatedate(new Timestamp(new Date().getTime()));
		
		//setting parent entity to make relationship
		carEntity.setCustomerEntity(customerEntity);
		
		carRepository.save(CarMapper.toDB(carDTO, "add"));
	}
	
	@Override
	public List<CarDTO> findAll(){
		List<CarDTO> carDTOs = new ArrayList<>();
		List<CarEntity> carList = carRepository.findAll();
		for(CarEntity entity: carList) {
			carDTOs.add(CarMapper.toDTO(entity));
		}
		return carDTOs;
	}
	
	
	@Override
	public CarDTO findById(int rid) {
		CarEntity carEntity=carRepository.findById(rid).get();
		//CarDTO actorDTO=new ActorDTO();
		//BeanUtils.copyProperties(actorsEntity, actorDTO);
		//actorDTO.setMdate(actorsEntity.getYear());
		return CarMapper.toDTO(carEntity);
	}
	
	@Override
	public void deleteById(int rid) {
		carRepository.deleteById(rid);
	}
	
	@Override
	public void updateById(CarDTO carDTO) {
		carRepository.save(CarMapper.toDB(carDTO, "update"));
		
	}
	
	
	@Override
	public List<CarDTO> findAllCars(int cid){
		List<CarDTO> list = new ArrayList<>();
		CustomerEntity customerEntity=customerRepository.findById(cid).get();
		List<CarEntity> entities = customerEntity.getCarEntity();
		for(CarEntity entity: entities) {
			list.add(CarMapper.toDTO(entity));
		}
		return list;
	}
	

}
