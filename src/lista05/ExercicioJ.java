package lista05;
import java.util.Scanner;
public class ExercicioJ {
    public static void executar(Scanner leitor) {
        for (int temperaturaCelsius = 10;
        temperaturaCelsius <= 100;
        temperaturaCelsius += 10) {
            double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5.0;
            System.out.println(temperaturaCelsius + "°C = " + temperaturaFahrenheit + "°F");
        }
    }
}
