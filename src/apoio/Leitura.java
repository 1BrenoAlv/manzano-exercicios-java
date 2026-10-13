package apoio;

import java.util.Scanner;

public class Leitura {
    public static int lerInteiro(Scanner leitor, String mensagem) {
        System.out.print(mensagem);
        while (!leitor.hasNextInt()) {
            System.out.println("Digite um número inteiro válido.");
            leitor.next();
            System.out.print(mensagem);
        }
        int valor = leitor.nextInt();
        leitor.nextLine();
        return valor;
    }

    public static double lerReal(Scanner leitor, String mensagem) {
        System.out.print(mensagem);
        while (!leitor.hasNextDouble()) {
            System.out.println("Digite um número válido.");
            leitor.next();
            System.out.print(mensagem);
        }
        double valor = leitor.nextDouble();
        leitor.nextLine();
        return valor;
    }

    public static String lerTexto(Scanner leitor, String mensagem) {
        System.out.print(mensagem);
        return leitor.nextLine();
    }
}
