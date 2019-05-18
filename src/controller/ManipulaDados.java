/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import models.Dados;

/**
 *
 * @author djair
 */
public class ManipulaDados {
    private static ArrayList<Dados> listaDados = new ArrayList<>();
    
    public static void novoRegistro(double metal,double vidro,double plastico,double papel,double naoReciclavel,String estado){
       
        Dados dados = new Dados(metal,vidro,plastico,papel,naoReciclavel,estado);
        listaDados.add(dados);
    }
    public static Dados pegaRegistro(int i){
        return listaDados.get(i);
    }
}
