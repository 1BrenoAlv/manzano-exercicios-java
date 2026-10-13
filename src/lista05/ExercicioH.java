package lista05;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioH {
    public static void executar(Scanner leitor) {
        double base = Leitura.lerReal(leitor, "Base: ");
        int expoente = Leitura.lerInteiro(leitor, "Expoente inteiro não negativo: ");
        if (expoente < 0) {
            System.out.println("O expoente deve ser não negativo.");
            return;
        }
        double potencia = 1;
        for (int contador = 1;
        contador <= expoente;
        contador++) potencia *= base;
        System.out.println("Potência: " + potencia);
    }
}
