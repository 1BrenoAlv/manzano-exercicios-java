package lista02;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioG {
    public static void executar(Scanner leitor) {
        for (int contador = 1;
        contador <= 4;
        contador++) {
            int numero = Leitura.lerInteiro(leitor, "Número " + contador + ": ");
            if (numero % 2 == 0 && numero % 3 == 0) System.out.println(numero + " é divisível por 2 e 3.");
        }
    }
}
