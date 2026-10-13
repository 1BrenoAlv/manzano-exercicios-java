package lista04;
import java.util.Scanner;
public class ExercicioB {
    public static void executar(Scanner leitor) {
        int numero = 1;
        int soma = 0;
        do {
            if (numero % 2 == 0) soma += numero;
            numero++;
        }
        while (numero <= 500);
        System.out.println("Somatório dos pares: " + soma);
    }
}
