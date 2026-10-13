package lista02;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioL {
    public static void executar(Scanner leitor) {
        String nome = Leitura.lerTexto(leitor, "Nome: ");
        String sexo = Leitura.lerTexto(leitor, "Sexo (M ou F): ");
        if (sexo.equalsIgnoreCase("M")) System.out.println("Ilmo Sr. " + nome);
        else if (sexo.equalsIgnoreCase("F")) System.out.println("Ilma Sra. " + nome);
        else System.out.println("Sexo informado é inválido.");
    }
}
