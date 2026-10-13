package lista03;
import java.util.Scanner;
public class ExercicioG {
    public static void executar(Scanner leitor) {
        int primeiroTermo = 1;
        int segundoTermo = 1;
        int contador = 1;
        while (contador <= 15) {
            if (contador == 1) System.out.println(primeiroTermo);
            else if (contador == 2) System.out.println(segundoTermo);
            else {
                int proximoTermo = primeiroTermo + segundoTermo;
                System.out.println(proximoTermo);
                primeiroTermo = segundoTermo;
                segundoTermo = proximoTermo;
            }
            contador++;
        }
    }
}
