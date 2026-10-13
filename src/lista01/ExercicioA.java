package lista01;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioA {
    public static void executar(Scanner leitor) {
        double temperaturaCelsius = Leitura.lerReal(leitor, "Temperatura em Celsius: ");
        double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;
        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);
    }
}
