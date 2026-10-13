package lista03;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioL {
    public static void executar(Scanner leitor) {
        int maiorValor = 0;
        int menorValor = 0;
        boolean possuiValor = false;
        int numero = Leitura.lerInteiro(leitor, "Valor positivo ou negativo para encerrar: ");
        while (numero >= 0) {
            if (!possuiValor || numero > maiorValor) maiorValor = numero;
            if (!possuiValor || numero < menorValor) menorValor = numero;
            possuiValor = true;
            numero = Leitura.lerInteiro(leitor, "Valor positivo ou negativo para encerrar: ");
        }
        if (possuiValor) {
            System.out.println("Maior valor: " + maiorValor);
            System.out.println("Menor valor: " + menorValor);
        }
        else System.out.println("Nenhum valor positivo foi informado.");
    }
}
