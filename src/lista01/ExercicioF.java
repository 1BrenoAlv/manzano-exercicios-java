package lista01;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioF {
    public static void executar(Scanner leitor) {
        String primeiroValor = Leitura.lerTexto(leitor, "Primeiro valor: ");
        String segundoValor = Leitura.lerTexto(leitor, "Segundo valor: ");
        String valorTemporario = primeiroValor;
        primeiroValor = segundoValor;
        segundoValor = valorTemporario;
        System.out.println("Primeiro valor trocado: " + primeiroValor);
        System.out.println("Segundo valor trocado: " + segundoValor);
    }
}
