package com.kartik.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kartik.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}

