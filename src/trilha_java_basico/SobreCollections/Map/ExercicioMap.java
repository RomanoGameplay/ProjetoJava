package trilha_java_basico.SobreCollections.Map;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class ExercicioMap {
    public static void main(String[] args) {
        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        for (Map.Entry<String, Integer> estado:
                estados.entrySet()) {
            System.out.println("Estado = "+estado.getKey()+" - população = "+estado.getValue());
        }

        System.out.println("\n");
        estados.put("RN", 3534165);
        for (Map.Entry<String, Integer> estado:
                estados.entrySet()) {
            System.out.println("Estado = "+estado.getKey()+" - população = "+estado.getValue());
        }

        if (estados.containsKey("PB")){
            System.out.println("\ntrue");
        } else {
            System.out.println("\nEstado PB adicionado com sucesso!");
            estados.put("PB", 4039277);
        }
        System.out.println(estados.get("PE"));

        Map<String, Integer> estados1 = new LinkedHashMap<>(estados);
        for (Map.Entry<String, Integer> estado:
                estados1.entrySet()) {
            System.out.println("Estado = "+estado.getKey()+" - população = "+estado.getValue());
        }
        System.out.println("\n");
        Set<Map.Entry<String, Integer>> estados2 = new TreeSet<>(new ComparatorEstado());
        estados2.addAll(estados1.entrySet());

        System.out.println("\n");
        for (Map.Entry<String, Integer> estado:
                estados2) {
            System.out.println("Estado = "+estado.getKey()+" - população = "+estado.getValue());
        }

        Integer maisPopuloso = Collections.max(estados.values());
        Set<Map.Entry<String, Integer>> estadoMaisPopuloso = estados.entrySet();
        for (Map.Entry<String, Integer> estado:
             estadoMaisPopuloso) {
            if (estado.getValue().equals(maisPopuloso)){
                System.out.println(estado.getKey()+" - "+estado.getValue());
            }
        }

        Integer menosPopuloso = Collections.min(estados.values());
        Set<Map.Entry<String, Integer>> estadoMenosPopuloso = estados.entrySet();
        for (Map.Entry<String, Integer> estado:
                estadoMenosPopuloso) {
            if (estado.getValue().equals(menosPopuloso)){
                System.out.println(estado.getKey()+" - "+estado.getValue());
            }
        }

        Integer soma = 0;
        Iterator<Integer> it = estados.values().iterator();
        while (it.hasNext()){
            Integer next = it.next();
            soma += next;
        }
        System.out.println("Soma da população: "+soma);
        System.out.println("Média da população: "+(soma/estados.size()));

        Iterator<Integer> it1 = estados.values().iterator();
        while (it1.hasNext()){
            Integer next = it1.next();
            if (next < 4000000) it1.remove();
        }
        System.out.println(estados);
        estados.clear();
        System.out.println(estados.isEmpty());
    }
}

class ComparatorEstado implements Comparator<Map.Entry<String, Integer>>{
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o1.getKey().compareToIgnoreCase(o2.getKey());
    }
}
