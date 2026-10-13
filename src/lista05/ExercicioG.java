package lista05;
import java.util.Scanner;
public class ExercicioG {
    public static void executar(Scanner leitor) {
        int potencia = 1;
        for (int expoente = 0;
        expoente <= 15;
        expoente++) {
            System.out.println("3 elevado a " + expoente + " = " + potencia);
            potencia *= 3;
        }
    }
}
