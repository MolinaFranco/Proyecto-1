/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

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
public class Ventana extends JPanel {

    private final String nombre1;
    private final String nombre2;
    private final int porcentaje;



    public Ventana(String nombre1, String nombre2, float porcentaje) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.porcentaje = (int) porcentaje;
        setSize(800, 600);
        setVisible(true);
        init(nombre1, nombre2, (int) porcentaje);
    }

    private void init(String nombre1, String nombre2, int porcentaje ) {
        // Fuente de Datos
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue(nombre1, new Double(porcentaje));
        dataset.setValue(nombre2, new Double(100-porcentaje));        

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
        this.add(chartPanel);
    }

    public static void main(String nombre1, String nombre2, int porcentaje) {
        new Ventana(nombre1, nombre2, porcentaje).setVisible(true);
    }
}
