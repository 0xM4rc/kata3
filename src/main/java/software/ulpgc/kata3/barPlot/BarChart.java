package software.ulpgc.kata3.barPlot;


import java.util.List;

public record BarChart(List<Double> values, List<String> series, List<String> category) {
}
