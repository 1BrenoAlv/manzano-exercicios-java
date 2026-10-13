package lista03;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioK {
    public static void executar(Scanner leitor) {
        double areaTotal = 0;
        String continuar = "SIM";
        while (continuar.equalsIgnoreCase("SIM")) {
            String nomeComodo = Leitura.lerTexto(leitor, "Nome do cômodo: ");
            double largura = Leitura.lerReal(leitor, "Largura: ");
            double comprimento = Leitura.lerReal(leitor, "Comprimento: ");
            double areaComodo = largura * comprimento;
            areaTotal += areaComodo;
            System.out.println("Área de " + nomeComodo + ": " + areaComodo);
            continuar = Leitura.lerTexto(leitor, "Deseja continuar? (SIM ou NAO): ");
        }
        System.out.println("Área total da residência: " + areaTotal);
    }
}
