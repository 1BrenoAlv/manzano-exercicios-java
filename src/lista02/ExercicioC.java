package lista02;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioC {
    public static void executar(Scanner leitor) {
        double somaNotas = 0;
        int contador = 1;
        while (contador <= 4) {
            somaNotas += Leitura.lerReal(leitor, "Nota " + contador + ": ");
            contador++;
        }
        double media = somaNotas / 4;
        System.out.println(media >= 5 ? "Aluno aprovado. Média: " + media : "Aluno reprovado. Média: " + media);
    }
}
