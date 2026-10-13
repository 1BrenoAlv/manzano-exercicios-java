package lista04;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioF {
    public static void executar(Scanner leitor) {
        double soma = 0;
        int quantidade = 0;
        double numero;
        do {
            numero = Leitura.lerReal(leitor, "Valor positivo ou negativo para encerrar: ");
            if (numero >= 0) {
                soma += numero;
                quantidade++;
            }
        }
        while (numero >= 0);
        System.out.println("Somatório: " + soma);
        System.out.println("Quantidade de valores: " + quantidade);
        if (quantidade > 0) System.out.println("Média: " + soma / quantidade);
        else System.out.println("Não há média para calcular.");
    }
}
