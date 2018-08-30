/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
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
public class Ventana_grafico extends JPanel {

    private final String nombre1;
    private final String nombre2;
    private final String titulo;
    private final float porcentaje;

    public Ventana_grafico(String nombre1, String nombre2, float porcentaje, String titulo) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.titulo = titulo;
        this.porcentaje = (int) porcentaje;
        setSize(800, 600);
        setVisible(true);
        init(nombre1, nombre2, (int) porcentaje, titulo);
    }

    private void init(String nombre1, String nombre2, int porcentaje, String titulo) {
        // Fuente de Datos
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue(nombre1, new Double(porcentaje));
        dataset.setValue(nombre2, new Double(100 - porcentaje));

        JFreeChart chart = ChartFactory.createPieChart3D(
                titulo, // chart title                   
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
        this.add(chartPanel);
    }

    public static void main(String nombre1, String nombre2, int porcentaje, String titulo) {
        new Ventana_grafico(nombre1, nombre2, porcentaje, titulo).setVisible(true);
    }
}
