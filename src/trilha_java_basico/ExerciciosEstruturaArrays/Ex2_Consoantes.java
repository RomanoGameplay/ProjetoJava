package trilha_java_basico.ExerciciosEstruturaArrays;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] lista_caracteres = new String[6];
        int qtdConsosantes = 0;
        int count = 0;

        do{
            System.out.println("Digite a letra: ");
            String letra = scan.next();
            if (!(letra.equalsIgnoreCase("a") ||
                            letra.equalsIgnoreCase("e") ||
                            letra.equalsIgnoreCase("i") ||
                            letra.equalsIgnoreCase("o") ||
                            letra.equalsIgnoreCase("u"))
            ){
                qtdConsosantes++;
                lista_caracteres[count] = letra;
            }
            count++;
        }while (count < lista_caracteres.length);

        System.out.println("Quantidade de consoantes: "+qtdConsosantes);

    }
}
