package com.anas.relations.entitiesDao;

import com.anas.relations.entities.Medcine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedcineDao extends JpaRepository<Medcine, Long> {
}
