package lista01;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioD {
    public static void executar(Scanner leitor) {
        double tempo = Leitura.lerReal(leitor, "Tempo gasto em horas: ");
        double velocidade = Leitura.lerReal(leitor, "Velocidade média em Km/h: ");
        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12;
        System.out.println("Velocidade média: " + velocidade);
        System.out.println("Tempo gasto: " + tempo);
        System.out.println("Distância percorrida: " + distancia);
        System.out.println("Litros usados: " + litrosUsados);
    }
}
