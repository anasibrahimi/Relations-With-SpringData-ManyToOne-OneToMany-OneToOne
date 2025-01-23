package com.anas.relations;

import com.anas.relations.HospitalServices.HosServices;
import com.anas.relations.HospitalServices.IHosServices;
import com.anas.relations.entities.*;
import com.anas.relations.entitiesDao.ConsultationDao;
import com.anas.relations.entitiesDao.MedcineDao;
import com.anas.relations.entitiesDao.PatientDao;
import com.anas.relations.entitiesDao.RendezVousDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Presentation {



	public static void main(String[] args) {
		SpringApplication.run(Presentation.class, args);

	}

	@Bean
	CommandLineRunner runner( IHosServices hosServices){

		return args -> {
			Patient p1 = new Patient();
			p1.setName("Ahmed");
			p1.setAddress("Riyadh");
			Patient p2 = new Patient();
			p2.setName("Anas");
			p2.setAddress("Zag");

			hosServices.savePatient(p1);
			hosServices.savePatient(p2);

			Medcine m1 = new Medcine();
			m1.setName("Amina");
			m1.setSpecialite("Anti-Inflammatory");
			Medcine m2 = new Medcine();
			m2.setName("Yahya");
			m2.setSpecialite("Anti-Inflammatory");

			hosServices.saveMedcine(m1);
			hosServices.saveMedcine(m2);

			RendezVous rendezVous = new RendezVous();
			rendezVous.setPatient(p1);
			rendezVous.setMedcine(m2);
			rendezVous.setDate(new Date());
			rendezVous.setStatus(StatusRV.PENDING);
			RendezVous rendezVous2 = new RendezVous();
			rendezVous2.setPatient(p2);
			rendezVous2.setMedcine(m2);
			rendezVous2.setDate(new Date());
			rendezVous2.setStatus(StatusRV.CANCELED);

			hosServices.saveRendezVous(rendezVous);
			hosServices.saveRendezVous(rendezVous2);

			Consultation consultation = new Consultation();
			consultation.setDateConsultation(new Date());
			consultation.setRendezVous(rendezVous);

			Consultation consultation2 = new Consultation();
			consultation2.setDateConsultation(new Date());
			consultation2.setRendezVous(rendezVous2);

			hosServices.saveConsultation(consultation);
			hosServices.saveConsultation(consultation2);

			System.out.println("Done");
		};
	}
}
