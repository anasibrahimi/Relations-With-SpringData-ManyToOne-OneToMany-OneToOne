package com.anas.relations.entitiesDao;

import com.anas.relations.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationDao extends JpaRepository<Consultation, String> {
}
