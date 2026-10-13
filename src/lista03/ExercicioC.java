package lista03;
import java.util.Scanner;
public class ExercicioC {
    public static void executar(Scanner leitor) {
        int numero = 1;
        int soma = 0;
        while (numero <= 500) {
            if (numero % 2 == 0) soma += numero;
            numero++;
        }
        System.out.println("Somatório dos pares: " + soma);
    }
}
