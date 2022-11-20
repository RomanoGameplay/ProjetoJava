package trilha_java_basico.SobreCollections.Map;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());
        carrosPopulares.put("gol", 16.1);

        System.out.println("Substitua o consumo do gol por 15.2: "+carrosPopulares);
        System.out.println(carrosPopulares.containsKey("tucson"));
        System.out.println(carrosPopulares.containsKey("gol"));

        System.out.println(carrosPopulares.get("uno"));

        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry:
            entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente é: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        Double menosConsumoEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry2:
                carrosPopulares.entrySet()) {
            if (entry2.getValue().equals(menosConsumoEficiente)) {
                modeloMenosEficiente = entry2.getKey();
                System.out.println("Modelo menos eficiente: "+modeloMenosEficiente+" - "+menosConsumoEficiente);
            }
        }

        Iterator<Double> it = carrosPopulares.values().iterator();
        double soma = 0d;

        while (it.hasNext()){
            double next = it.next();
            soma += next;
        }
        System.out.println(soma);
        System.out.println("Média: "+(soma/carrosPopulares.size()));

        Iterator<Double> it1 = carrosPopulares.values().iterator();
        while (it1.hasNext()){
            if (it1.next().equals(15.6)) it1.remove();
        }
        System.out.println(carrosPopulares);

        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);

        System.out.println(carrosPopulares2);

        carrosPopulares1.clear();
        System.out.println(carrosPopulares1.isEmpty());
    }
}
