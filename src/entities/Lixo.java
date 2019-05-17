/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author djairtb
 */
public class Lixo {
    private Double peso;
    public Integer tempoDecomposicao = 0;
    
    public Lixo(Double peso ){
        this.peso = peso;
    }
    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
