package software.ulpgc.kata3.barChart.swing;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JFreeBarChartDisplay barChartDisplay;

    public MainFrame() throws HeadlessException {
        setTitle("Bar Chart");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(createBarChartDisplay());
    }

    private Component createBarChartDisplay() {
        this.barChartDisplay = new JFreeBarChartDisplay();
        return this.barChartDisplay;
    }

    public BarChartDisplay barChartDisplay(){
        return this.barChartDisplay;
    }
}
