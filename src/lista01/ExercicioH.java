package lista01;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioH {
    public static void executar(Scanner leitor) {
        double comprimento = Leitura.lerReal(leitor, "Comprimento: ");
        double largura = Leitura.lerReal(leitor, "Largura: ");
        double altura = Leitura.lerReal(leitor, "Altura: ");
        System.out.println("Volume: " + comprimento * largura * altura);
    }
}
