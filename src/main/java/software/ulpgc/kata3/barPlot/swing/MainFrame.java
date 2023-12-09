package software.ulpgc.kata3.barPlot.swing;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JFreeBarChartDisplay barChartDisplay;

    public MainFrame() {
        setTitle("Bar Plot");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(creteBarChartDisplay());
    }

    private Component creteBarChartDisplay() {
        JFreeBarChartDisplay display=new JFreeBarChartDisplay();
        barChartDisplay = display;
        return display;
    }

    public BarChartDisplay barChartDisplay(){
        return barChartDisplay;
    }
}
