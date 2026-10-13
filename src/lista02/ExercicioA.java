package lista02;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioA {
    public static void executar(Scanner leitor) {
        int primeiroNumero = Leitura.lerInteiro(leitor, "Primeiro número: ");
        int segundoNumero = Leitura.lerInteiro(leitor, "Segundo número: ");
        System.out.println("Diferença: " + Math.abs(primeiroNumero - segundoNumero));
    }
}
