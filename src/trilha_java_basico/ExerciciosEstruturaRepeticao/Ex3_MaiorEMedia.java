package trilha_java_basico.ExerciciosEstruturaRepeticao;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        int count = 0;
        double media = 0;
        double maior = 0;
        Scanner scanner = new Scanner(System.in);
        double num;
        while (count < 5){
            num = scanner.nextDouble();
            if (num >= maior){
                maior = num;
            }
            media+=num;
            count++;
        }
        System.out.println("Maior número: "+maior);
        System.out.println("Média: "+ media/count);
    }
}
