package lista02;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioD {
    public static void executar(Scanner leitor) {
        double somaNotas = 0;
        int contador = 1;
        while (contador <= 4) {
            somaNotas += Leitura.lerReal(leitor, "Nota " + contador + ": ");
            contador++;
        }
        double media = somaNotas / 4;
        if (media >= 7) System.out.println("Aluno aprovado. Média: " + media);
        else {
            double notaExame = Leitura.lerReal(leitor, "Nota do exame: ");
            double novaMedia = (media + notaExame) / 2;
            System.out.println(novaMedia >= 5 ? "Aluno aprovado em exame. Média: " + novaMedia : "Aluno reprovado. Média: " + novaMedia);
        }
    }
}
