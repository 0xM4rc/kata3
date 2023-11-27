package software.ulpgc.kata3.barChar;

import java.util.List;

public class BarChart {
    // a->valor double[]
    // b->tipo String[]
    // c->categoría Str[]
    private final List<Double>values;
    private final List<String> series;
    private final List<String> category;

    public BarChart(List<Double> values, List<String> series, List<String> category) {
        this.values = values;
        this.series = series;
        this.category = category;
    }

    public List<Double> getValues() {
        return values;
    }

    public List<String> getSeries() {
        return series;
    }

    public List<String> getCategory() {
        return category;
    }
}
