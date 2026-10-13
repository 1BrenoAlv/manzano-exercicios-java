package lista05;
import java.util.Scanner;
public class ExercicioD {
    public static void executar(Scanner leitor) {
        int soma = 0;
        for (int numero = 1;
        numero <= 500;
        numero++) if (numero % 2 == 0) soma += numero;
        System.out.println("Somatório dos pares: " + soma);
    }
}
