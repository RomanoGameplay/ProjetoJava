package trilha_java_basico.ExerciciosEstruturaArrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] lista_numeros = {1, 2, 3, 4, 5, 6};
        int count = 0;
        System.out.print("Vetor Original: ");
        while(count < lista_numeros.length){
            System.out.print(lista_numeros[count] + " ");
            count++;
        }

        System.out.print("\nVetor inverso: ");
        for (int i = (lista_numeros.length - 1); i >= 0 ;i--){
            System.out.print(lista_numeros[i] + " ");
        }
    }
}
