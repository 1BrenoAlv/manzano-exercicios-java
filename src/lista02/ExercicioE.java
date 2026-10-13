package lista02;
import apoio.Leitura;
import java.util.Scanner;
public class ExercicioE {
    public static void executar(Scanner leitor) {
        double coeficienteQuadratico = Leitura.lerReal(leitor, "Coeficiente A: ");
        double coeficienteLinear = Leitura.lerReal(leitor, "Coeficiente B: ");
        double termoIndependente = Leitura.lerReal(leitor, "Coeficiente C: ");
        double discriminante = coeficienteLinear * coeficienteLinear - 4 * coeficienteQuadratico * termoIndependente;
        if (coeficienteQuadratico == 0 || discriminante < 0) System.out.println("Não é possível calcular raízes reais.");
        else {
            System.out.println("Primeira raiz: " + (-coeficienteLinear + Math.sqrt(discriminante)) / (2 * coeficienteQuadratico));
            System.out.println("Segunda raiz: " + (-coeficienteLinear - Math.sqrt(discriminante)) / (2 * coeficienteQuadratico));
        }
    }
}
