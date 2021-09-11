package com.kartik.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kartik.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}

