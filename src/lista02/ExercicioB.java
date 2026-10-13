package lista02;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioB {
    public static void executar(Scanner leitor) {
        int numero = Leitura.lerInteiro(leitor, "Digite um número inteiro: ");
        System.out.println("Valor positivo: " + Math.abs(numero));
    }
}
