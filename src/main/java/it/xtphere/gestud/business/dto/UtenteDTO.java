/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.xtphere.gestud.business.dto;

/**
 *
 * @author xtphere
 */
public class UtenteDTO {
    
    private String nome;
    private String cognome;
    private PianoDiStudiDTO pianoDiStudi;

    public UtenteDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public PianoDiStudiDTO getPianoDiStudi() {
        return pianoDiStudi;
    }

    public void setPianoDiStudi(PianoDiStudiDTO pianoDiStudi) {
        this.pianoDiStudi = pianoDiStudi;
    }
}