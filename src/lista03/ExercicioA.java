package lista03;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioA {
    public static void executar(Scanner leitor) {
        int numero = Leitura.lerInteiro(leitor, "Número da tabuada: ");
        int contador = 1;
        while (contador <= 10) {
            System.out.println(numero + " x " + contador + " = " + numero * contador);
            contador++;
        }
    }
}
