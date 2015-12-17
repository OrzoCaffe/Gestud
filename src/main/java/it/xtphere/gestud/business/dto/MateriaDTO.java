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
public class MateriaDTO {
    
    private String nome;
    private String voto;

    public MateriaDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVoto() {
        return voto;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }
    
}