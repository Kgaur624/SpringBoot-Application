package com.kartik.flightcheckin.integration;

import com.kartik.flightcheckin.integration.dto.Reservation;
import com.kartik.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);

	public Reservation updateReservation(ReservationUpdateRequest request);

}

