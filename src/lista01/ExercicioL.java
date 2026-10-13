package lista01;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioL {
    public static void executar(Scanner leitor) {
        double primeiroValor = Leitura.lerReal(leitor, "Primeiro valor: ");
        double segundoValor = Leitura.lerReal(leitor, "Segundo valor: ");
        double terceiroValor = Leitura.lerReal(leitor, "Terceiro valor: ");
        System.out.println("Soma dos quadrados: " + (primeiroValor * primeiroValor + segundoValor * segundoValor + terceiroValor * terceiroValor));
    }
}
