package com.jatha.apmng.hospitalservice.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctorScedules")
public class DoctorSchedules {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String docRegNo;
	String hosRegNo;
	Date date;
	String session;
	Time expectedArrival;
	String status;
	int currentAppointmentNumber;
	int totalBookings;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDocRegNo() {
		return docRegNo;
	}
	public void setDocRegNo(String docRegNo) {
		this.docRegNo = docRegNo;
	}
	public String getHosRegNo() {
		return hosRegNo;
	}
	public void setHosRegNo(String hosRegNo) {
		this.hosRegNo = hosRegNo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	
	public Time getExpectedArrival() {
		return expectedArrival;
	}
	public void setExpectedArrival(Time expectedArrival) {
		this.expectedArrival = expectedArrival;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCurrentAppointmentNumber() {
		return currentAppointmentNumber;
	}
	public void setCurrentAppointmentNumber(int currentAppointmentNumber) {
		this.currentAppointmentNumber = currentAppointmentNumber;
	}
	public int getTotalBookings() {
		return totalBookings;
	}
	public void setTotalBookings(int totalBookings) {
		this.totalBookings = totalBookings;
	}
	
	
	
	

}


