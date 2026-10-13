package lista01;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioC {
    public static void executar(Scanner leitor) {
        double raio = Leitura.lerReal(leitor, "Raio da lata: ");
        double altura = Leitura.lerReal(leitor, "Altura da lata: ");
        double volume = Math.PI * raio * raio * altura;
        System.out.println("Volume da lata: " + volume);
    }
}
