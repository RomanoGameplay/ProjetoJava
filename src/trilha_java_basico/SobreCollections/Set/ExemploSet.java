package trilha_java_basico.SobreCollections.Set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 5d, 8.5, 6.4, 5.4, 3d, 0d));
        System.out.println(notas.toString());

        System.out.println(notas.contains(5d));
        System.out.println("Menor nota: "+ Collections.min(notas));
        System.out.println("Maior nota: "+ Collections.max(notas));

        Iterator<Double> it = notas.iterator();
        double soma = 0;
        while(it.hasNext()){
            Double next = it.next();
            soma+=next;
        }
        System.out.println(soma);
        System.out.println(notas.size());
        System.out.println("Média: "+(soma/notas.size()));
        notas.remove(0d);
        System.out.println(notas);
        Iterator<Double> it1 = notas.iterator();
        while (it1.hasNext()){
            double next = it1.next();
            if (next < 7) it1.remove();
        }
        System.out.println(notas);

        Set<Double> notas1 = new LinkedHashSet<>(Arrays.asList(7d, 5d, 7d, 8.5, 6.4, 5.4, 3d, 0d));
        System.out.println(notas1);
        Set<Double> notas3 = new TreeSet<>(notas1);
        System.out.println(notas3);
        System.out.println("Apagar conjunto: ");
        notas3.clear();
        System.out.println(notas3);
        System.out.println(notas3.isEmpty());
        System.out.println(notas.isEmpty());
    }
}
