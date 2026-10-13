package lista05;
import java.util.Scanner;
public class ExercicioC {
    public static void executar(Scanner leitor) {
        int soma = 0;
        for (int numero = 1;
        numero <= 100;
        numero++) soma += numero;
        System.out.println("Soma: " + soma);
    }
}
