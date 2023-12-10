package software.ulpgc.kata3;


import software.ulpgc.kata3.barChart.BarChart;
import software.ulpgc.kata3.barChart.swing.MainFrame;
import software.ulpgc.kata3.electricVehicle.CsvFileElectricVehicleLoader;
import software.ulpgc.kata3.electricVehicle.ElectricVehicle;
import software.ulpgc.kata3.electricVehicle.ElectricVehicleStatistic;
import software.ulpgc.kata3.electricVehicle.YearsElectricVehicleStatic;
import java.io.File;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Cargar datos de vehículos eléctricos desde un archivo CSV
        List<ElectricVehicle> vehicles = CsvFileElectricVehicleLoader.with(
                        new File("src/main/resources/Electric_Vehicle_Population_Data_simplified.csv"))
                .load();

        ElectricVehicleStatistic statistic = new YearsElectricVehicleStatic();
        Map<String, Integer> map = statistic.calculate(vehicles);

        List<String> sortedYears = new ArrayList<>(map.keySet());
        sortedYears.sort(null);

        List<Double> sortedValues = new ArrayList<>();
        for (String year :
                sortedYears) {
            sortedValues.add(Double.valueOf(map.get(year)));
        }

        MainFrame frame = new MainFrame();
        frame.barChartDisplay().show(new BarChart(sortedValues, sortedYears, null));

    }
}