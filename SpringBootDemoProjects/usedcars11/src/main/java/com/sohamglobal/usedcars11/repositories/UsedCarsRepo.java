package com.sohamglobal.usedcars11.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sohamglobal.usedcars11.entities.UsedCar;

@Repository
public interface UsedCarsRepo extends JpaRepository<UsedCar, Integer> {

}
