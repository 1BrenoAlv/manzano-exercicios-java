package lista01;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioI {
    public static void executar(Scanner leitor) {
        int primeiroNumero = Leitura.lerInteiro(leitor, "Primeiro número: ");
        int segundoNumero = Leitura.lerInteiro(leitor, "Segundo número: ");
        int diferenca = primeiroNumero - segundoNumero;
        System.out.println("Quadrado da diferença: " + diferenca * diferenca);
    }
}
