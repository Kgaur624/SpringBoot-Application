package com.kartik.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kartik.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}

