package lista05;
import java.util.Scanner;
public class ExercicioK {
    public static void executar(Scanner leitor) {
        for (int numero = 1;
        numero <= 10;
        numero += 2) {
            long fatorial = 1;
            for (int multiplicador = 1;
            multiplicador <= numero;
            multiplicador++) fatorial *= multiplicador;
            System.out.println(numero + "! = " + fatorial);
        }
    }
}
