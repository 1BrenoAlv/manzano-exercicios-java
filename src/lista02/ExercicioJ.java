package lista02;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioJ {
    public static void executar(Scanner leitor) {
        int valor = Leitura.lerInteiro(leitor, "Digite um valor: ");
        System.out.println(valor >= 1 && valor <= 9 ? "O valor está na faixa permitida." : "O valor está fora da faixa permitida.");
    }
}
