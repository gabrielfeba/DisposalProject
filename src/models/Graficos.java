/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controller.ManipulaDados;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Fernanda
 */
public class Graficos {
    public ChartPanel criarPizza(){
        
        DefaultPieDataset dpd = new DefaultPieDataset();
        dpd.setValue("Metal", ManipulaDados.pegaTotal().getMetal());
        dpd.setValue("Papel", ManipulaDados.pegaTotal().getPapel());
        dpd.setValue("Plástico", ManipulaDados.pegaTotal().getPlastico());
        dpd.setValue("Vidro", ManipulaDados.pegaTotal().getVidro());
        dpd.setValue("Não Reciclável", ManipulaDados.pegaTotal().getNaoReciclavel());


        JFreeChart grafico = ChartFactory.createPieChart3D("Dados por tipo", dpd, true, true, true);

        ChartPanel chartPanel = new ChartPanel(grafico);
        return chartPanel;
    }
}
