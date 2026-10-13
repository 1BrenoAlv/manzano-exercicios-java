package lista01;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioE {
    public static void executar(Scanner leitor) {
        double valor = Leitura.lerReal(leitor, "Valor da prestação: ");
        double taxa = Leitura.lerReal(leitor, "Taxa de juros (%): ");
        double tempo = Leitura.lerReal(leitor, "Tempo de atraso: ");
        double prestacao = valor + (valor * taxa / 100) * tempo;
        System.out.println("Prestação em atraso: " + prestacao);
    }
}
