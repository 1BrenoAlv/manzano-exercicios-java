package lista03;
import java.util.Scanner;
public class ExercicioE {
    public static void executar(Scanner leitor) {
        int expoente = 0;
        int potencia = 1;
        while (expoente <= 15) {
            System.out.println("3 elevado a " + expoente + " = " + potencia);
            potencia *= 3;
            expoente++;
        }
    }
}
