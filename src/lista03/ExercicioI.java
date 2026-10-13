package lista03;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioI {
    public static void executar(Scanner leitor) {
        double soma = 0;
        int contador = 1;
        while (contador <= 10) {
            soma += Leitura.lerReal(leitor, "Valor " + contador + ": ");
            contador++;
        }
        System.out.println("Somatório: " + soma);
        System.out.println("Média: " + soma / 10);
    }
}
