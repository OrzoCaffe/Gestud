package it.xtphere.gestud.business.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Materia implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String nome;
    
    @Column
    private double voto;
}
