package lista02;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioH {
    public static void executar(Scanner leitor) {
        int maiorValor = Leitura.lerInteiro(leitor, "Número 1: ");
        int menorValor = maiorValor;
        for (int contador = 2;
        contador <= 5;
        contador++) {
            int numero = Leitura.lerInteiro(leitor, "Número " + contador + ": ");
            if (numero > maiorValor) maiorValor = numero;
            if (numero < menorValor) menorValor = numero;
        }
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
    }
}
