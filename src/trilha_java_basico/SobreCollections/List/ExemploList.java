package trilha_java_basico.SobreCollections.List;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println(notas.indexOf(5.d));
        notas.add(4, 8.0);
        System.out.println(notas);
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Está na lista: "+ notas.contains(5d));
        System.out.println("Está na lista: "+ notas.contains(6d));

        for (double nota: notas) {System.out.println(nota);}

        System.out.println(notas.get(2));
        System.out.println("Menor nota: "+ Collections.min(notas));
        System.out.println("Maior nota: "+ Collections.max(notas));

        System.out.println("Soma dos valores: ");
        Iterator<Double> it = notas.iterator();
        Double soma = 0d;
        while (it.hasNext()){
            Double next = it.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Média: "+(soma/notas.size()));
        System.out.println("Remover a nota zero: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remover na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Notas menores que 7: ");

        Iterator<Double> it1 = notas.iterator();
        while (it1.hasNext()){
            Double next = it1.next();
            if (next < 7) it1.remove();
        }
        System.out.println(notas);

        System.out.println("Apagar toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Lista vazia: "+notas.isEmpty());
    }

}
