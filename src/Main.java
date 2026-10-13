import apoio.Leitura;
import java.util.Scanner;

public class Main {
    public static void main(String[] argumentos) {
        Scanner leitor = new Scanner(System.in);
        int opcaoLista = -1;

        while (opcaoLista != 0) {
            exibirMenuListas();
            opcaoLista = Leitura.lerInteiro(leitor, "Escolha uma lista: ");

            switch (opcaoLista) {
                case 1:
                    executarLista01(leitor);
                    break;
                case 2:
                    executarLista02(leitor);
                    break;
                case 3:
                    executarLista03(leitor);
                    break;
                case 4:
                    executarLista04(leitor);
                    break;
                case 5:
                    executarLista05(leitor);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Lista inválida.");
            }
        }

        leitor.close();
    }

    private static void exibirMenuListas() {
        System.out.println("\n--- EXERCÍCIOS MANZANO ---");
        System.out.println("1 - Lista 01: página 25");
        System.out.println("2 - Lista 02: página 41");
        System.out.println("3 - Lista 03: página 46");
        System.out.println("4 - Lista 04: página 50");
        System.out.println("5 - Lista 05: página 66");
        System.out.println("0 - Sair");
    }

    private static void executarLista01(Scanner leitor) {
        int opcaoExercicio = Leitura.lerInteiro(leitor, "Exercício da Lista 01 (1 a 13): ");
        switch (opcaoExercicio) {
            case 1: lista01.ExercicioA.executar(leitor); break;
            case 2: lista01.ExercicioB.executar(leitor); break;
            case 3: lista01.ExercicioC.executar(leitor); break;
            case 4: lista01.ExercicioD.executar(leitor); break;
            case 5: lista01.ExercicioE.executar(leitor); break;
            case 6: lista01.ExercicioF.executar(leitor); break;
            case 7: lista01.ExercicioG.executar(leitor); break;
            case 8: lista01.ExercicioH.executar(leitor); break;
            case 9: lista01.ExercicioI.executar(leitor); break;
            case 10: lista01.ExercicioJ.executar(leitor); break;
            case 11: lista01.ExercicioK.executar(leitor); break;
            case 12: lista01.ExercicioL.executar(leitor); break;
            case 13: lista01.ExercicioM.executar(leitor); break;
            default: System.out.println("Exercício inválido.");
        }
    }

    private static void executarLista02(Scanner leitor) {
        int opcaoExercicio = Leitura.lerInteiro(leitor, "Exercício da Lista 02 (1 a 12): ");
        switch (opcaoExercicio) {
            case 1: lista02.ExercicioA.executar(leitor); break;
            case 2: lista02.ExercicioB.executar(leitor); break;
            case 3: lista02.ExercicioC.executar(leitor); break;
            case 4: lista02.ExercicioD.executar(leitor); break;
            case 5: lista02.ExercicioE.executar(leitor); break;
            case 6: lista02.ExercicioF.executar(leitor); break;
            case 7: lista02.ExercicioG.executar(leitor); break;
            case 8: lista02.ExercicioH.executar(leitor); break;
            case 9: lista02.ExercicioI.executar(leitor); break;
            case 10: lista02.ExercicioJ.executar(leitor); break;
            case 11: lista02.ExercicioK.executar(leitor); break;
            case 12: lista02.ExercicioL.executar(leitor); break;
            default: System.out.println("Exercício inválido.");
        }
    }

    private static void executarLista03(Scanner leitor) {
        int opcaoExercicio = Leitura.lerInteiro(leitor, "Exercício da Lista 03 (1 a 12): ");
        switch (opcaoExercicio) {
            case 1: lista03.ExercicioA.executar(leitor); break;
            case 2: lista03.ExercicioB.executar(leitor); break;
            case 3: lista03.ExercicioC.executar(leitor); break;
            case 4: lista03.ExercicioD.executar(leitor); break;
            case 5: lista03.ExercicioE.executar(leitor); break;
            case 6: lista03.ExercicioF.executar(leitor); break;
            case 7: lista03.ExercicioG.executar(leitor); break;
            case 8: lista03.ExercicioH.executar(leitor); break;
            case 9: lista03.ExercicioI.executar(leitor); break;
            case 10: lista03.ExercicioJ.executar(leitor); break;
            case 11: lista03.ExercicioK.executar(leitor); break;
            case 12: lista03.ExercicioL.executar(leitor); break;
            default: System.out.println("Exercício inválido.");
        }
    }

    private static void executarLista04(Scanner leitor) {
        int opcaoExercicio = Leitura.lerInteiro(leitor, "Exercício da Lista 04 (1 a 10): ");
        switch (opcaoExercicio) {
            case 1: lista04.ExercicioA.executar(leitor); break;
            case 2: lista04.ExercicioB.executar(leitor); break;
            case 3: lista04.ExercicioC.executar(leitor); break;
            case 4: lista04.ExercicioD.executar(leitor); break;
            case 5: lista04.ExercicioE.executar(leitor); break;
            case 6: lista04.ExercicioF.executar(leitor); break;
            case 7: lista04.ExercicioG.executar(leitor); break;
            case 8: lista04.ExercicioH.executar(leitor); break;
            case 9: lista04.ExercicioI.executar(leitor); break;
            case 10: lista04.ExercicioJ.executar(leitor); break;
            default: System.out.println("Exercício inválido.");
        }
    }

    private static void executarLista05(Scanner leitor) {
        int opcaoExercicio = Leitura.lerInteiro(leitor, "Exercício da Lista 05 (1 a 11): ");
        switch (opcaoExercicio) {
            case 1: lista05.ExercicioA.executar(leitor); break;
            case 2: lista05.ExercicioB.executar(leitor); break;
            case 3: lista05.ExercicioC.executar(leitor); break;
            case 4: lista05.ExercicioD.executar(leitor); break;
            case 5: lista05.ExercicioE.executar(leitor); break;
            case 6: lista05.ExercicioF.executar(leitor); break;
            case 7: lista05.ExercicioG.executar(leitor); break;
            case 8: lista05.ExercicioH.executar(leitor); break;
            case 9: lista05.ExercicioI.executar(leitor); break;
            case 10: lista05.ExercicioJ.executar(leitor); break;
            case 11: lista05.ExercicioK.executar(leitor); break;
            default: System.out.println("Exercício inválido.");
        }
    }
}
