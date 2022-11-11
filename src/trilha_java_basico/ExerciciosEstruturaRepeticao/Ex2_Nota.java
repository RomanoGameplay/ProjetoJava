package trilha_java_basico.ExerciciosEstruturaRepeticao;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        while (true){
            System.out.println("Digite a sua nota: ");
            nota = scanner.nextInt();
            if (0 <= nota && nota <= 10){
                System.out.println("Nota válida!");
                break;
            }
        }
    }
}
