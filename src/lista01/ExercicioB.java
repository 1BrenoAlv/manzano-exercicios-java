package lista01;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioB {
    public static void executar(Scanner leitor) {
        double temperaturaFahrenheit = Leitura.lerReal(leitor, "Temperatura em Fahrenheit: ");
        double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;
        System.out.println("Temperatura em Celsius: " + temperaturaCelsius);
    }
}
