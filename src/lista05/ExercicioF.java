package lista05;
import java.util.Scanner;
public class ExercicioF {
    public static void executar(Scanner leitor) {
        for (int numero = 1;
        numero < 200;
        numero++) if (numero % 4 == 0) System.out.println(numero);
    }
}
