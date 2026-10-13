package lista01;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioM {
    public static void executar(Scanner leitor) {
        double primeiroValor = Leitura.lerReal(leitor, "Primeiro valor: ");
        double segundoValor = Leitura.lerReal(leitor, "Segundo valor: ");
        double terceiroValor = Leitura.lerReal(leitor, "Terceiro valor: ");
        double soma = primeiroValor + segundoValor + terceiroValor;
        System.out.println("Quadrado da soma: " + soma * soma);
    }
}
