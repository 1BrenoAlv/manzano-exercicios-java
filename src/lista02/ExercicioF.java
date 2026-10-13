package lista02;
import apoio.Leitura;
import java.util.Arrays;
import java.util.Scanner;
public class ExercicioF {
    public static void executar(Scanner leitor) {
        double[] valores = new double[3];
        for (int indice = 0;
        indice < valores.length;
        indice++) valores[indice] = Leitura.lerReal(leitor, "Valor " + (indice + 1) + ": ");
        Arrays.sort(valores);
        System.out.println("Ordem crescente: " + valores[0] + ", " + valores[1] + ", " + valores[2]);
    }
}
