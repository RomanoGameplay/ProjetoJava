package trilha_java_basico.SobreCollections.List;


import java.util.ArrayList;
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
        System.out.println(notas.toString());

        System.out.println(notas.indexOf(5.d));
        notas.add(4, 8.0);
        System.out.println(notas.toString());
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas.toString());

        System.out.println("Está na lista: "+ notas.contains(5d));
        System.out.println("Está na lista: "+ notas.contains(6d));

        for (double nota: notas) {System.out.println(nota);}
    }

}
