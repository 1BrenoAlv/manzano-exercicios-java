package lista04;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioI {
    public static void executar(Scanner leitor) {
        boolean possuiValor = false;
        int maiorValor = 0;
        int menorValor = 0;
        int numero;
        do {
            numero = Leitura.lerInteiro(leitor, "Valor positivo ou negativo para encerrar: ");
            if (numero >= 0) {
                if (!possuiValor || numero > maiorValor) maiorValor = numero;
                if (!possuiValor || numero < menorValor) menorValor = numero;
                possuiValor = true;
            }
        }
        while (numero >= 0);
        if (possuiValor) {
            System.out.println("Maior valor: " + maiorValor);
            System.out.println("Menor valor: " + menorValor);
        }
        else System.out.println("Nenhum valor positivo foi informado.");
    }
}
