package com.jatha.apmng.patientservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jatha.apmng.patientservice.model.Patient;
import com.jatha.apmng.patientservice.service.PatientService;

@RestController
@RequestMapping(value = "/services")
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@RequestMapping(value = "/patients",method = RequestMethod.POST)
	public Patient savePatient(@RequestBody Patient patient) {
		
		return patientService.save(patient);
		
	}
	
	@RequestMapping(value = "/patients",method = RequestMethod.GET)
	public List<Patient> findAllPatient() {
		
		return patientService.findAll();
		
	}
	
	@RequestMapping(value = "/patients/{id}",method = RequestMethod.GET)
	public Optional<Patient> findPatientById(@PathVariable(value="id") int id) {
		
		return patientService.findById(id);
		
	}
	
	@RequestMapping(value = "/patients/find",method = RequestMethod.GET)
	public Optional<Patient> findPatient(@RequestParam(name="nic",required=false) String nic,@RequestParam(name="id",required=false) String id) {
		if(nic!=null){
			return patientService.findByNICNumber(nic);
			
		}
		if(id!=null){
			
			int i=Integer.parseInt(id);  
			return patientService.findById(i);	
		}
		
		return null;
		
	}

}
