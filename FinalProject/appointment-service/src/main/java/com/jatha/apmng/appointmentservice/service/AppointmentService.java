package com.jatha.apmng.appointmentservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.jatha.apmng.appointmentservice.model.Appointment;
import com.jatha.apmng.appointmentservice.model.Hospital;

public interface AppointmentService {
	
	Appointment save(Appointment appointment);
	
	List<Appointment> findAll();
	
	Optional<Appointment> findById(int id);
	
	ResponseEntity<?> deleteAppointment(int id);

	List<Hospital> findByHospitalName(String hosName);

}