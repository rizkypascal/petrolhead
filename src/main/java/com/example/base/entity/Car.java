package com.example.base.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {
	private @Id @GeneratedValue int id;
	
	private String colour;
	private String plateNumber;
	private long mileage;

	public Car(){
		super();
	}
	
	public Car(int id, String colour, String plateNumber, long mileage) {
		super();
		this.id = id;
		this.colour = colour;
		this.plateNumber = plateNumber;
		this.mileage = mileage;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}	
	
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public void setMileage(long mileage) {
		this.mileage = mileage;
	}
	
	public int getId() {
		return this.id;
	}

	public String getColour() {
		return this.colour;
	}	
	
	public String getPlateNumber() {
		return this.plateNumber;
	}
	
	public long getMileage() {
		return this.mileage;
	}
	
}
