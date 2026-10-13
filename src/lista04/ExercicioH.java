package lista04;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioH {
    public static void executar(Scanner leitor) {
        double areaTotal = 0;
        String continuar;
        do {
            String nomeComodo = Leitura.lerTexto(leitor, "Nome do cômodo: ");
            double largura = Leitura.lerReal(leitor, "Largura: ");
            double comprimento = Leitura.lerReal(leitor, "Comprimento: ");
            double areaComodo = largura * comprimento;
            areaTotal += areaComodo;
            System.out.println("Área de " + nomeComodo + ": " + areaComodo);
            continuar = Leitura.lerTexto(leitor, "Deseja continuar? (SIM ou NAO): ");
        }
        while (continuar.equalsIgnoreCase("SIM"));
        System.out.println("Área total da residência: " + areaTotal);
    }
}
