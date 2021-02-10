package com.jatha.apmng.hospitalservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.jatha.apmng.hospitalservice.model.VisitingDoctors;

public interface VisitingDoctorService {
	
	
	VisitingDoctors save(VisitingDoctors visitingDoctors);
	
	List<VisitingDoctors> findAll();
	
	List<VisitingDoctors> findByHosRegNo(String hosRegNo);
	
	Optional<VisitingDoctors> findByHosRegNoAndDocRegNo(String hosRegNo,String docRegNo); 

	ResponseEntity<?> deleteVisitingDoctors(String hosRegNo, String docRegNo);

}