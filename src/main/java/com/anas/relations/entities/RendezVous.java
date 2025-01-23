package com.anas.relations.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class RendezVous {

    @Id
    private String id;
    @Temporal(TemporalType.DATE)
    private Date date;

    @Enumerated(EnumType.STRING)
    private StatusRV status ;
    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Medcine medcine;

    @OneToOne(mappedBy = "rendezVous" , fetch = FetchType.LAZY)
    private Consultation consultation;

}
