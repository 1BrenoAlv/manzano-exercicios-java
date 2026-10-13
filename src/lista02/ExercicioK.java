package lista02;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioK {
    public static void executar(Scanner leitor) {
        int valor = Leitura.lerInteiro(leitor, "Digite um valor: ");
        if (valor <= 3) System.out.println("Valor informado: " + valor);
    }
}
