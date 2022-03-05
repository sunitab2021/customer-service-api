package com.technohunk.mapper;

import org.springframework.beans.BeanUtils;

import com.technohunk.dao.entity.CustomerEntity;
import com.technohunk.dto.CustomerDTO;

public class CustomerMapper {
	public static CustomerEntity toDB(CustomerDTO customerDTO, String operation) {
		CustomerEntity customerEntity = new CustomerEntity();
		if("edit".equalsIgnoreCase(operation)) {
			customerEntity.setCid(customerDTO.getCid());
		} else {
			customerEntity.setCreatedate(customerDTO.getCreatedate());
		}
		customerEntity.setUpdateddate(customerDTO.getUpdateddate());
		customerEntity.setEducation(customerDTO.getEducation());
		customerEntity.setEmail(customerDTO.getEmail());
		customerEntity.setGender(customerDTO.getGender());
		customerEntity.setMobile(customerDTO.getMobile());
		customerEntity.setName(customerDTO.getName());
		customerEntity.setPhoto(customerDTO.getPhoto());
		return customerEntity;
		
	}
	
	public static CustomerDTO toDTO(CustomerEntity customerEntity) {
		CustomerDTO customerDTO = new CustomerDTO();
		BeanUtils.copyProperties(customerEntity,  customerDTO);
		return customerDTO;
		
	}

}
