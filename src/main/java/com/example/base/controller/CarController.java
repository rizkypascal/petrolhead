package com.example.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.base.entity.Car;
import com.example.base.service.CarService;

@RestController
public class CarController {
 
 @Autowired
 private CarService carService;
 
 @GetMapping("/")
 public String home (){
  return "Spring REST Dinesh on Java!!!";
 }
 
 @GetMapping("/cars")
 public List<Car> all (){
  return carService.list();
 }
 
 @PostMapping("/cars")
 public ResponseEntity<Object> create (@RequestBody Car car){
  carService.insert(car);
  return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
 }
 
// @GetMapping("/cars/{carId}")
// public Car get (@PathVariable Long CarId){
//  return CarService.get(CarId);
// }
 
 @PatchMapping("/cars/{carId}")
 public ResponseEntity<Object> update (@RequestBody Car car, @PathVariable Long carId){
  Car updatedCar = carService.update(car, carId);
  if (updatedCar.equals(null)) {
	  return ResponseEntity.notFound().build();
  }
  else {
	  return new ResponseEntity<>("Product is updated successfully", HttpStatus.OK);
  }
  
 }
 
 @DeleteMapping("/cars/{carId}")
 public ResponseEntity<Object> delete (@PathVariable Long CarId){
  carService.delete(CarId);
  return new ResponseEntity<>("Product is deleted successfully", HttpStatus.OK);
 }
}