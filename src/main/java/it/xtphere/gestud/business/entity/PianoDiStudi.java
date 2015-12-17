/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.xtphere.gestud.business.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author xtphere
 */
@Entity
public class PianoDiStudi implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String nomePianoDiStudi;
    
    @ManyToMany
    private List<Materia> materia;
}
