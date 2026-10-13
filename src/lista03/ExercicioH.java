package lista03;
import java.util.Scanner;
public class ExercicioH {
    public static void executar(Scanner leitor) {
        int temperaturaCelsius = 10;
        while (temperaturaCelsius <= 100) {
            double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5.0;
            System.out.println(temperaturaCelsius + "°C = " + temperaturaFahrenheit + "°F");
            temperaturaCelsius += 10;
        }
    }
}
