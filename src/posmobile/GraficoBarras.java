/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posmobile;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *Essa classe
 * 
 */
public class GraficoBarras implements Observador  {
     private DefaultCategoryDataset  dataset;    
    private JFrame  frame = new JFrame();

    public GraficoBarras() {
        dataset = new DefaultCategoryDataset();
        JFreeChart chart = ChartFactory.createBarChart(
                "Carteira de Ações", "Siglas",
                "Quantidade", dataset, PlotOrientation.HORIZONTAL.HORIZONTAL.VERTICAL,
                false, true, false);
        ChartPanel chartPanel = new ChartPanel(chart);
        frame.setContentPane(chartPanel);
        frame.setSize(500, 270);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mudancaQuantidade(String acao, Integer qtd) {
        dataset.setValue(qtd, "Quantidade", acao);
    }
    
}
