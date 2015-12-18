/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.xtphere.gestud.business.dto;

import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author xtphere
 */
public class ScuolaDTO implements Serializable{
    private String nomeUtente;
    private String cognomeUtente;
    private String nomePianoDiStudi;
    private Map<String, Double> materia;

    public ScuolaDTO() {
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public String getCognomeUtente() {
        return cognomeUtente;
    }

    public void setCognomeUtente(String cognomeUtente) {
        this.cognomeUtente = cognomeUtente;
    }

    public String getNomePianoDiStudi() {
        return nomePianoDiStudi;
    }

    public void setNomePianoDiStudi(String nomePianoDiStudi) {
        this.nomePianoDiStudi = nomePianoDiStudi;
    }

    public Map<String, Double> getMateria() {
        return materia;
    }

    public void setMateria(Map<String, Double> materia) {
        this.materia = materia;
    }

    
    
}
