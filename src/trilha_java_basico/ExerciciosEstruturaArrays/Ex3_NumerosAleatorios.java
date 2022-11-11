package trilha_java_basico.ExerciciosEstruturaArrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] listaNumerosAleatorios = new int[20];

        for (int i = 0; i< listaNumerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            listaNumerosAleatorios[i] = numero;
        }

        System.out.println("Números aleatórios: ");
        for (int numero: listaNumerosAleatorios) {
            System.out.print(numero+" ");
        }

        System.out.println("\nSucessores dos números aleatórios: ");
        for (int numero: listaNumerosAleatorios) {
            System.out.print((numero+1)+" ");
        }
    }
}
