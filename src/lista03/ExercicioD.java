package lista03;
import java.util.Scanner;
public class ExercicioD {
    public static void executar(Scanner leitor) {
        int numero = 0;
        while (numero <= 20) {
            if (numero % 2 != 0) System.out.println(numero);
            numero++;
        }
    }
}
