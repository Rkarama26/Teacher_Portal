package com.example.Teacher_portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Teacher_portal.model.Appointments;

public interface AppointmentRepository extends JpaRepository<Appointments, Long> {
	

}
