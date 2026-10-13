package lista04;
import java.util.Scanner;
public class ExercicioD {
    public static void executar(Scanner leitor) {
        double graosNoQuadro = 1;
        double totalGraos = 0;
        int quadro = 1;
        do {
            totalGraos += graosNoQuadro;
            graosNoQuadro *= 2;
            quadro++;
        }
        while (quadro <= 64);
        System.out.println("Total de grãos: " + totalGraos);
    }
}
