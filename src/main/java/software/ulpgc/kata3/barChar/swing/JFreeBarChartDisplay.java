package software.ulpgc.kata3.barChar.swing;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import software.ulpgc.kata3.barChar.BarChart;

import javax.swing.*;
import java.awt.*;

public class JFreeBarChartDisplay extends JPanel implements BarChartDisplay {

    public JFreeBarChartDisplay() { setLayout(new BorderLayout());}
    @Override
    public void show(BarChart barChar) {
        add(new ChartPanel(barChart(createDataset(barChar))));
    }

    private JFreeChart barChart(CategoryDataset dataset) {
        JFreeChart barChart = ChartFactory.createBarChart(
                "chartTitle",
                "Category",
                "Score",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        // Ajuste de etiquetas
        CategoryPlot plot = barChart.getCategoryPlot();
        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);

        return barChart;
    }

    private CategoryDataset createDataset(BarChart barChart) {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int i = 0;
        for (String s : barChart.getSeries()) {
            System.out.println(barChart.getValues().get(i));
            System.out.println(barChart.getSeries().get(i));
            dataset.addValue(barChart.getValues().get(i), "Conteo", barChart.getSeries().get(i));
            i++;
        }
        return dataset;
    }

}
