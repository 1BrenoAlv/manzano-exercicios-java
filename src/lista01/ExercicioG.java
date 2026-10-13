package lista01;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioG {
    public static void executar(Scanner leitor) {
        int primeiroNumero = Leitura.lerInteiro(leitor, "Primeiro número: ");
        int segundoNumero = Leitura.lerInteiro(leitor, "Segundo número: ");
        int terceiroNumero = Leitura.lerInteiro(leitor, "Terceiro número: ");
        int quartoNumero = Leitura.lerInteiro(leitor, "Quarto número: ");
        int[] numeros = {
            primeiroNumero, segundoNumero, terceiroNumero, quartoNumero
        }
        ;
        for (int primeiroIndice = 0;
        primeiroIndice < numeros.length;
        primeiroIndice++) {
            for (int segundoIndice = primeiroIndice + 1;
            segundoIndice < numeros.length;
            segundoIndice++) {
                System.out.println(numeros[primeiroIndice] + " + " + numeros[segundoIndice] + " = " + (numeros[primeiroIndice] + numeros[segundoIndice]));
                System.out.println(numeros[primeiroIndice] + " x " + numeros[segundoIndice] + " = " + (numeros[primeiroIndice] * numeros[segundoIndice]));
            }
        }
    }
}
