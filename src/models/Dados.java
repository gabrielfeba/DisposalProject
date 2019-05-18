/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author djairtb
 */
public class Dados {
    private Double metal;
    private Double plastico;
    private Double papel;
    private Double vidro;
    private Double naoReciclavel;
    private String estado;

    public Dados(Double metal, Double plastico, Double papel, Double vidro, Double naoReciclavel) {
        this.metal = metal;
        this.plastico = plastico;
        this.papel = papel;
        this.vidro = vidro;
        this.naoReciclavel = naoReciclavel;
    }
        public Dados(Double metal, Double plastico, Double papel, Double vidro, Double naoReciclavel,String estado) {
        this.metal = metal;
        this.plastico = plastico;
        this.papel = papel;
        this.vidro = vidro;
        this.naoReciclavel = naoReciclavel;
        this.estado = estado;
    }

    public Double getMetal() {
        return metal;
    }

    public void setMetal(Double metal) {
        this.metal = metal;
    }

    public Double getPlastico() {
        return plastico;
    }

    public void setPlastico(Double plastico) {
        this.plastico = plastico;
    }

    public Double getPapel() {
        return papel;
    }

    public void setPapel(Double papel) {
        this.papel = papel;
    }

    public Double getVidro() {
        return vidro;
    }

    public void setVidro(Double vidro) {
        this.vidro = vidro;
    }

    public Double getNaoReciclavel() {
        return naoReciclavel;
    }

    public void setNaoReciclavel(Double naoReciclavel) {
        this.naoReciclavel = naoReciclavel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
