package lista03;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioF {
    public static void executar(Scanner leitor) {
        double base = Leitura.lerReal(leitor, "Base: ");
        int expoente = Leitura.lerInteiro(leitor, "Expoente inteiro não negativo: ");
        if (expoente < 0) {
            System.out.println("O expoente deve ser não negativo.");
            return;
        }
        double potencia = 1;
        int contador = 0;
        while (contador < expoente) {
            potencia *= base;
            contador++;
        }
        System.out.println("Potência: " + potencia);
    }
}
