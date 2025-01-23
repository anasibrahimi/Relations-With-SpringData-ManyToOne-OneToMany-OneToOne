package com.anas.relations.entitiesDao;

import com.anas.relations.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDao extends JpaRepository<Patient, Long> {

}
