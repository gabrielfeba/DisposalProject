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
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
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
    
    public ChartPanel criarColunas(){
        Dados dadosSaoPaulo = ManipulaDados.separaEstado("SP");
        Dados dadosBahia = ManipulaDados.separaEstado("BA");
        Dados dadosMinasGerais = ManipulaDados.separaEstado("MG");
        
        DefaultCategoryDataset dpd = new DefaultCategoryDataset();
        dpd.addValue(dadosSaoPaulo.getMetal(), "Metal", "São Paulo");
        dpd.addValue(dadosSaoPaulo.getPapel(), "Papel", "São Paulo");
        dpd.addValue(dadosSaoPaulo.getPlastico(), "Plastico", "São Paulo");
        dpd.addValue(dadosSaoPaulo.getVidro(), "Vidro", "São Paulo");
        dpd.addValue(dadosSaoPaulo.getNaoReciclavel(), "Não Reciclavel", "São Paulo");
        
        dpd.addValue(dadosBahia.getMetal(), "Metal", "Bahia");
        dpd.addValue(dadosBahia.getPapel(), "Papel", "Bahia");
        dpd.addValue(dadosBahia.getPlastico(), "Plastico", "Bahia");
        dpd.addValue(dadosBahia.getVidro(), "Vidro", "Bahia");
        dpd.addValue(dadosBahia.getNaoReciclavel(), "Não Reciclavel", "Bahia");
        
        dpd.addValue(dadosMinasGerais.getMetal(), "Metal", "Minas Gerais");
        dpd.addValue(dadosMinasGerais.getPapel(), "Papel", "Minas Gerais");
        dpd.addValue(dadosMinasGerais.getPlastico(), "Plastico", "Minas Gerais");
        dpd.addValue(dadosMinasGerais.getVidro(), "Vidro", "Minas Gerais");
        dpd.addValue(dadosMinasGerais.getNaoReciclavel(), "Não Reciclavel", "Minas Gerais");
        
        JFreeChart grafico = ChartFactory.createBarChart("Dados por estado", "", "Peso", dpd, PlotOrientation.VERTICAL, true, true, true);

        ChartPanel chartPanel = new ChartPanel(grafico);
        return chartPanel;
    }
    
    public ChartPanel criarLinhas(){
        
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        for(int i=0; i<ManipulaDados.getListaDados().size(); i++ ){
            ds.addValue( ManipulaDados.getListaDados().get(i).getMetal(), "Metal", "Dia "+(i+1) );
            ds.addValue( ManipulaDados.getListaDados().get(i).getPapel(), "Papel", "Dia "+(i+1) );
            ds.addValue( ManipulaDados.getListaDados().get(i).getVidro(), "Vidro", "Dia "+(i+1) );
            ds.addValue( ManipulaDados.getListaDados().get(i).getPlastico(), "Plástico", "Dia "+(i+1) );
            ds.addValue( ManipulaDados.getListaDados().get(i).getNaoReciclavel(), "Não Reciclável", "Dia "+(i+1) );
        }
        JFreeChart grafico = ChartFactory.createLineChart("Dados por Dia", "Dias","Peso", ds,PlotOrientation.VERTICAL, true, true, false );
        ChartPanel chartPanel = new ChartPanel(grafico);
        return chartPanel;
    }
    
}
