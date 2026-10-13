package lista05;
import java.util.Scanner;
public class ExercicioI {
    public static void executar(Scanner leitor) {
        int primeiroTermo = 1;
        int segundoTermo = 1;
        for (int contador = 1;
        contador <= 15;
        contador++) {
            if (contador == 1) System.out.println(primeiroTermo);
            else if (contador == 2) System.out.println(segundoTermo);
            else {
                int proximoTermo = primeiroTermo + segundoTermo;
                System.out.println(proximoTermo);
                primeiroTermo = segundoTermo;
                segundoTermo = proximoTermo;
            }
        }
    }
}
