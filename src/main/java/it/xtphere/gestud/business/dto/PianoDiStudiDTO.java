/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.xtphere.gestud.business.dto;

import java.util.List;

/**
 *
 * @author xtphere
 */
public class PianoDiStudiDTO {
    private String nomePianoDiStudi;
    private List<MateriaDTO> materia;

    public PianoDiStudiDTO() {
    }

    public String getNomePianoDiStudi() {
        return nomePianoDiStudi;
    }

    public void setNomePianoDiStudi(String nomePianoDiStudi) {
        this.nomePianoDiStudi = nomePianoDiStudi;
    }

    public List<MateriaDTO> getMateria() {
        return materia;
    }

    public void setMateria(List<MateriaDTO> materia) {
        this.materia = materia;
    }
    
    
}
