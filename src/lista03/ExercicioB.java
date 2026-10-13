package lista03;
import java.util.Scanner;
public class ExercicioB {
    public static void executar(Scanner leitor) {
        int contador = 1;
        int soma = 0;
        while (contador <= 100) {
            soma += contador;
            contador++;
        }
        System.out.println("Soma: " + soma);
    }
}
