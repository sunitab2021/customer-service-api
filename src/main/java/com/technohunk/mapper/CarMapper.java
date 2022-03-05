package com.technohunk.mapper;

import org.springframework.beans.BeanUtils;

import com.technohunk.dao.entity.CarEntity;
import com.technohunk.dto.CarDTO;


public class CarMapper {
	public static CarEntity toDB(CarDTO carDTO, String operation) {
		CarEntity carEntity = new CarEntity();
		if("edit".equalsIgnoreCase(operation)) {
			carEntity.setRid(carDTO.getRid());
		} //else {
			//carEntity.setyear(carDTO.getCreatedate());
		//}
		carEntity.setMake(carDTO.getMake());
		carEntity.setModel(carDTO.getModel());
		//carEntity.setYear(carDTO.getYear());
		carEntity.setPrice(carDTO.getPrice());
		
		return carEntity;
		
	}
	
	public static CarDTO toDTO(CarEntity carEntity) {
		CarDTO carDTO = new CarDTO();
		BeanUtils.copyProperties(carEntity,  carDTO);
		return carDTO;
		
	}

}
