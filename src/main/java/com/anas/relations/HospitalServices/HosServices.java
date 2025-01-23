package com.anas.relations.HospitalServices;

import com.anas.relations.entities.Consultation;
import com.anas.relations.entities.Medcine;
import com.anas.relations.entities.Patient;
import com.anas.relations.entities.RendezVous;
import com.anas.relations.entitiesDao.ConsultationDao;
import com.anas.relations.entitiesDao.MedcineDao;
import com.anas.relations.entitiesDao.PatientDao;
import com.anas.relations.entitiesDao.RendezVousDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
public class HosServices implements IHosServices{
    private PatientDao patientDao;
    private MedcineDao medcineDao;
    private RendezVousDao rendezVousDao;
    private ConsultationDao consultationDao;

    @Autowired
    public HosServices(PatientDao patientDao, MedcineDao medcineDao,
                       RendezVousDao rendezVousDao, ConsultationDao consultationDao) {
        this.patientDao = patientDao;
        this.medcineDao = medcineDao;
        this.rendezVousDao = rendezVousDao;
        this.consultationDao = consultationDao;
    }

    public HosServices() {

    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientDao.save(patient);
    }

    @Override
    public Medcine saveMedcine(Medcine medcine) {
        return medcineDao.save(medcine);
    }

    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString());
        return rendezVousDao.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        consultation.setId(UUID.randomUUID().toString());
        return consultationDao.save(consultation);
    }

    @Override
    public void deletePatient(Long id) {
            patientDao.deleteById(id);
    }

    @Override
    public void deleteMedcine(Long id) {
            medcineDao.deleteById(id);
    }

    @Override
    public void deleteRendezVous(String id) {
            rendezVousDao.deleteById(id);
    }

    @Override
    public void deleteConsultation(String id) {
            consultationDao.deleteById(id);
    }
}
