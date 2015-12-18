/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.xtphere.gestud.business.dto;

import java.io.Serializable;

/**
 *
 * @author xtphere
 */
public class scuolaDTO implements Serializable{
    private String nomeUtente;
    private String cognomeUtente;
    private String nomePianoDiStudi;
    private String nomeMaterie;
    private double votoMaterie;

    public scuolaDTO() {
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

    public String getNomeMaterie() {
        return nomeMaterie;
    }

    public void setNomeMaterie(String nomeMaterie) {
        this.nomeMaterie = nomeMaterie;
    }

    public double getVotoMaterie() {
        return votoMaterie;
    }

    public void setVotoMaterie(double votoMaterie) {
        this.votoMaterie = votoMaterie;
    }
    
    
}
