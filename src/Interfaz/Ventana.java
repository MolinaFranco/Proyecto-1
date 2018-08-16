/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author franco
 */
public class Ventana extends JPanel {

    public Ventana() {
        setSize(800, 600);
        setVisible(true);
        init();
    }

    private void init() {
        // Fuente de Datos
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("IPhone 5s", new Double(20));
        dataset.setValue("SamSung Grand", new Double(20));
        dataset.setValue("MotoG", new Double(40));
        dataset.setValue("Nokia Lumia", new Double(10));

        JFreeChart chart = ChartFactory.createPieChart3D(
                "Mobile Sales", // chart title                   
                dataset, // data 
                true, // include legend                   
                true,
                false);

        final PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(270);
        plot.setForegroundAlpha(0.60f);
        plot.setInteriorGap(0.02);
        int width = 940;
        /* Width of the image */
        int height = 480;
        /* Height of the image */
        //ChartUtilities.saveChartAsJPEG( pieChart3D , chart , width , height );
        // Crear el Panel del Grafico con ChartPanel
        ChartPanel chartPanel = new ChartPanel(chart);
        System.out.println(chartPanel);
        this.add(chartPanel);
    }

    public static void main(String args[]) {
        new Ventana().setVisible(true);
    }
}
