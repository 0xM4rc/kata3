package software.ulpgc.kata3.barChar.swing;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import software.ulpgc.kata3.barChar.BarChart;

import javax.swing.*;
import java.awt.*;

public class JFreeBarChartDisplay extends JPanel implements BarChartDisplay {

    public JFreeBarChartDisplay() { setLayout(new BorderLayout());}
    @Override
    public void show(BarChart barChar) {
        add(new ChartPanel(barChart(createDataset())));
    }

    private JFreeChart barChart(CategoryDataset dataset) {
        JFreeChart barChart = ChartFactory.createBarChart(
                "chartTitle",
                "Category",
                "Score",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        /*
        ChartPanel chartPanel = new ChartPanel( barChart );
        chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );
        setContentPane( chartPanel );
         */
    }
}
