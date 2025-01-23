package com.anas.relations.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Consultation {

    @Id
    private String id;
    @Temporal(TemporalType.DATE)
    private Date dateConsultation ;

    @OneToOne
    private RendezVous rendezVous ;

}
