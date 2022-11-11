package trilha_java_basico.ExerciciosEstruturaRepeticao;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int num = scanner.nextInt();
        int count = 0;

        System.out.println("Tabuada de "+num);
        while (count <= 10){
            System.out.println(num+" X "+count+" = "+(num*count));
            count++;
        }
    }
}
