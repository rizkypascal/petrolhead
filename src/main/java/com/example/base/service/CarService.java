package com.example.base.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.base.entity.Car;
import com.example.base.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;
	
	public List<Car> list() {
		return (List<Car>) carRepository.findAll();
	}
	
	@Transactional
	public void delete(long id) {
		carRepository.deleteById(id);
	}
	
	@Transactional
	public Car update(Car car, long id) {
		Optional<Car> carObj = carRepository.findById(id);
		
		if(carObj.isPresent()) {
			return null;
		}

		return carRepository.save(car);
	}
	
	public Car insert(Car car) {
		return carRepository.save(car);
	}

}
