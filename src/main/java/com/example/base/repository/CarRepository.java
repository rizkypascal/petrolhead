package com.example.base.repository;

import com.example.base.entity.Car;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
	//delete
	public List<Car> findByPlateNumberIs(String plate_number);
	public List<Car> findByPlateNumberEquals(String plate_number);
	public List<Car> findByPlateNumberIsNot(String plate_number);
//	public List<Car> findByActiveTrue();
//	public List<Car> findByActiveFalse();
	List<Car> findByPlateNumberStartingWith(String prefix);
	List<Car> findByPlateNumberEndingWith(String suffix);
	List<Car> findByPlateNumberContaining(String infix);
	List<Car> findByPlateNumberLike(String likePattern);
	List<Car> findByMileageLessThanEqual(long mileage);
	List<Car> findByMileageGreaterThan(long mileage);
	List<Car> findByMileageGreaterThanEqual(long mileage);
	List<Car> findByMileageBetween(long startMileage, long endMileage);
	List<Car> findByMileageIn(List<Long> mileages);
//	List<Car> findByNameOrBirthDate(String name, ZonedDateTime birthDate);
//	List<Car> findByNameOrderByName(String name);
//	List<Car> findByNameOrderByNameAsc(String name);
//	List<Car> findByNameOrderByNameDesc(String name);
}
