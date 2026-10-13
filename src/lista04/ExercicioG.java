package lista04;
import java.util.Scanner;
public class ExercicioG {
    public static void executar(Scanner leitor) {
        int numero = 1;
        do {
            long fatorial = 1;
            int multiplicador = 1;
            do {
                fatorial *= multiplicador;
                multiplicador++;
            } while (multiplicador <= numero);
            System.out.println(numero + "! = " + fatorial);
            numero += 2;
        }
        while (numero <= 10);
    }
}
