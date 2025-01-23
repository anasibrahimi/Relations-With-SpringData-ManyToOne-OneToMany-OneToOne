package com.anas.relations.HospitalServices;

import com.anas.relations.entities.Consultation;
import com.anas.relations.entities.Medcine;
import com.anas.relations.entities.Patient;
import com.anas.relations.entities.RendezVous;

public interface IHosServices {
    Patient savePatient(Patient patient);
    Medcine saveMedcine(Medcine medcine);
    RendezVous saveRendezVous(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
    void deletePatient(Long id);
    void deleteMedcine(Long id);
    void deleteRendezVous(String id);
    void deleteConsultation(String id);
}
