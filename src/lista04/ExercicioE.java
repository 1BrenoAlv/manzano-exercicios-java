package lista04;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioE {
    public static void executar(Scanner leitor) {
        long somaFatoriais = 0;
        int contador = 1;
        do {
            int numero = Leitura.lerInteiro(leitor, "Valor inteiro " + contador + ": ");
            long fatorial = 1;
            int multiplicador = 1;
            do {
                fatorial *= multiplicador;
                multiplicador++;
            } while (multiplicador <= numero);
            somaFatoriais += fatorial;
            contador++;
        }
        while (contador <= 15);
        System.out.println("Soma dos fatoriais: " + somaFatoriais);
    }
}
