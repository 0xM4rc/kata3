package software.ulpgc.kata3.barChar;

import java.util.List;

/**
 * @param values a->valor double[] b->tipo String[] c->categoría Str[]
 */
public record BarChart(List<Double> values, List<String> series, List<String> category) {
}
