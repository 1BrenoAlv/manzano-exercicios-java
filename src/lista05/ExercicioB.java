package lista05;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioB {
    public static void executar(Scanner leitor) {
        int numero = Leitura.lerInteiro(leitor, "Número da tabuada: ");
        for (int multiplicador = 1;
        multiplicador <= 10;
        multiplicador++) System.out.println(numero + " x " + multiplicador + " = " + numero * multiplicador);
    }
}
