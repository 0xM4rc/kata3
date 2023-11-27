package software.ulpgc.kata3;

import software.ulpgc.kata3.barChar.BarChart;
import software.ulpgc.kata3.barChar.swing.MainFrame;
import software.ulpgc.kata3.electricVehicle.CsvFileElectricVehicleLoader;
import software.ulpgc.kata3.electricVehicle.ElectricVehicle;
import software.ulpgc.kata3.electricVehicle.ElectricVehicleStatistic;
import software.ulpgc.kata3.electricVehicle.YearsElectricVehicleStatic;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<ElectricVehicle> vehicles = CsvFileElectricVehicleLoader.with(
                        new File("src/main/resources/Electric_Vehicle_Population_Data_simplified.csv"))
                .load();
        MainFrame frame = new MainFrame();
        ElectricVehicleStatistic statistic = new YearsElectricVehicleStatic();
        Map<String, Integer> map = statistic.calculate(vehicles);

        // Preparar datos para el gráfico de barras
        List<String> years = new ArrayList<>(map.keySet());
        Collections.sort(years);
        List<Double> values = new ArrayList<>();
        List<String> categories = new ArrayList<>();
        categories.add(""); // Agrega una categoría, aunque esté vacía

        // Convertir los valores del mapa a Double y almacenarlos en una lista
        for (String year : years) {
            values.add(Double.valueOf(map.get(year)));
        }

        // Mostrar el gráfico de barras
        frame.barChartDisplay().show(new BarChart(values, years, categories));
        frame.setVisible(true);
    }

}
