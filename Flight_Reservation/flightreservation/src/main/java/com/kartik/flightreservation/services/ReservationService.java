package com.kartik.flightreservation.services;

import com.kartik.flightreservation.dto.ReservationRequest;
import com.kartik.flightreservation.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);

}

