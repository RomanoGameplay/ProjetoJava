package trilha_java_basico.ExerciciosEstruturaRepeticao;

import java.util.Scanner;

public class EX6_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o fatorial: ");
        int fatorial = scanner.nextInt();
        int count = 1;
        int resultado = 1;

        while (count <= fatorial){
            resultado *= count;
            count++;
        }
        System.out.println(fatorial+"! = "+resultado);
    }
}
