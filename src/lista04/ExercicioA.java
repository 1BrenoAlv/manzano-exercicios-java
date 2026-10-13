package lista04;
import java.util.Scanner;
public class ExercicioA {
    public static void executar(Scanner leitor) {
        int numero = 15;
        do {
            System.out.println(numero + " ao quadrado = " + numero * numero);
            numero++;
        }
        while (numero <= 200);
    }
}
