package software.ulpgc.kata3.barChar.swing;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private BarChartDisplay barChartDisplay;

    public MainFrame() throws HeadlessException{
        setTitle("Histogram");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(createBarChartDisplay());
    }

    private Component createBarChartDisplay() {
        JFreeBarChartDisplay display = new JFreeBarChartDisplay();
        barChartDisplay = display;
        return display;
    }

    public BarChartDisplay barChartDisplay(){
        return barChartDisplay;
    }

}
