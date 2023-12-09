package software.ulpgc.kata3.barChart.swing;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JFreeBarChartDisplay barChartDisplay;

    public MainFrame() throws HeadlessException {
        setTitle("BarPlot");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(createChartDisplay());
    }

    private Component createChartDisplay() {
        this.barChartDisplay = new JFreeBarChartDisplay();
        return  this.barChartDisplay;
    }

    public BarChartDisplay barChartDisplay(){
        return this.barChartDisplay;
    }
}
