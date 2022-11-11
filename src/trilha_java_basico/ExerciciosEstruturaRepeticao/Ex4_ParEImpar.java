package trilha_java_basico.ExerciciosEstruturaRepeticao;
import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero de inteiros: ");
        int count = scanner.nextInt();
        int num;
        int numeroDePares = 0;
        int numeroDeImpares = 0;

        while (count != 0){
            num = scanner.nextInt();
            if ((num % 2) == 0){
                System.out.println("É par!");
                numeroDePares++;
            } else {
                System.out.println("É ímpar!");
                numeroDeImpares++;
            }
            count--;
        }
        System.out.println("Número de pares: "+numeroDePares);
        System.out.println("Número de ímpares: "+numeroDeImpares);
    }
}
