package com.technohunk.mapper;

import org.springframework.beans.BeanUtils;

//import com.technohunk.dao.entity.CarEntity;
import com.technohunk.dao.entity.PaymentEntity;
//import com.technohunk.dto.CarDTO;
import com.technohunk.dto.PaymentDTO;

public class PaymentMapper {
	public static PaymentEntity toDB(PaymentDTO paymentDTO, String operation) {
		PaymentEntity paymentEntity = new PaymentEntity();
		if("edit".equalsIgnoreCase(operation)) {
			paymentEntity.setPid(paymentDTO.getPid());
		} //else {
			//carEntity.setyear(carDTO.getCreatedate());
		//}
		paymentEntity.setAmount(paymentDTO.getAmount());
		paymentEntity.setPdetail(paymentDTO.getPdetail());
		
		return paymentEntity;
		
	}
	
	public static PaymentDTO toDTO(PaymentEntity paymentEntity) {
		PaymentDTO paymentDTO = new PaymentDTO();
		BeanUtils.copyProperties(paymentEntity,  paymentDTO);
		return paymentDTO;
		
	}


}
