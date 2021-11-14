package com.Appointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.Appointment.entities.patient;

public interface patientRepository extends JpaRepository<patient,Integer>
{

}
