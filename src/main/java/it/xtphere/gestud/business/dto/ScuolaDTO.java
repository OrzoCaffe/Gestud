/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.xtphere.gestud.business.dto;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author xtphere
 */
public class ScuolaDTO implements Serializable{
    private String nomeUtente;
    private String cognomeUtente;
    private String nomePianoDiStudi;
    private List<String> nomeMateria;
    private List<Double> votoMateria;

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

    public List<String> getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(List<String> nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public List<Double> getVotoMateria() {
        return votoMateria;
    }

    public void setVotoMateria(List<Double> votoMateria) {
        this.votoMateria = votoMateria;
    }
    
}
