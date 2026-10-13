package lista01;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioK {
    public static void executar(Scanner leitor) {
        double cotacaoDolar = Leitura.lerReal(leitor, "Cotação do dólar: ");
        double quantidadeReais = Leitura.lerReal(leitor, "Quantidade de reais: ");
        System.out.println("Valor em dólares: " + quantidadeReais / cotacaoDolar);
    }
}
