package lista04;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioJ {
    public static void executar(Scanner leitor) {
        int dividendo = Leitura.lerInteiro(leitor, "Dividendo não negativo: ");
        int divisor = Leitura.lerInteiro(leitor, "Divisor positivo: ");
        if (dividendo < 0 || divisor <= 0) {
            System.out.println("Informe dividendo não negativo e divisor positivo.");
            return;
        }
        int quociente = 0;
        int restante = dividendo;
        do {
            if (restante >= divisor) {
                restante -= divisor;
                quociente++;
            }
        }
        while (restante >= divisor);
        System.out.println("Quociente inteiro: " + quociente);
    }
}
