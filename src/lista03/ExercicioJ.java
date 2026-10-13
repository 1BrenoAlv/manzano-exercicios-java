package lista03;
import java.util.Scanner;
public class ExercicioJ {
    public static void executar(Scanner leitor) {
        int numero = 50;
        int soma = 0;
        int quantidade = 0;
        while (numero <= 70) {
            if (numero % 2 == 0) {
                soma += numero;
                quantidade++;
            }
            numero++;
        }
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + (double) soma / quantidade);
    }
}
