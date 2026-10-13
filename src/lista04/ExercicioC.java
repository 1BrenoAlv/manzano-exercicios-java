package lista04;
import java.util.Scanner;
public class ExercicioC {
    public static void executar(Scanner leitor) {
        int numero = 1;
        do {
            if (numero % 4 == 0) System.out.println(numero);
            numero++;
        }
        while (numero < 200);
    }
}
