package com.anas.relations.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Medcine {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String specialite;

    @OneToMany(mappedBy = "medcine" , fetch = FetchType.LAZY)
    private List<RendezVous> rendezVous;
}
