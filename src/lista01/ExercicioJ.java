package lista01;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioJ {
    public static void executar(Scanner leitor) {
        double cotacaoDolar = Leitura.lerReal(leitor, "Cotação do dólar: ");
        double quantidadeDolares = Leitura.lerReal(leitor, "Quantidade de dólares: ");
        System.out.println("Valor em reais: " + cotacaoDolar * quantidadeDolares);
    }
}
