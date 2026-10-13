package lista02;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioI {
    public static void executar(Scanner leitor) {
        int numero = Leitura.lerInteiro(leitor, "Digite um número inteiro: ");
        System.out.println(numero % 2 == 0 ? "O número é par." : "O número é ímpar.");
    }
}
