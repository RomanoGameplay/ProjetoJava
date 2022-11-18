package trilha_java_basico.SobreCollections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        List<Temperatura> temperaturas = new ArrayList<>(){{
            add(new Temperatura(12, "janeiro"));
            add(new Temperatura(23, "fevereiro"));
            add(new Temperatura(45, "marco"));
            add(new Temperatura(33, "abril"));
            add(new Temperatura(45, "maio"));
            add(new Temperatura(42, "junho"));
        }};
        for (Temperatura temp: temperaturas) System.out.println(temp.toString());
        int soma = 0;
        Iterator<Temperatura> it = temperaturas.iterator();
        while (it.hasNext()){
            int next = it.next().getTemperatura();
            soma += next;
        }
        System.out.println("\nMédia das temperaturas: "+(soma/temperaturas.size()));
        int media = soma/temperaturas.size();

        Iterator<Temperatura> it1 = temperaturas.iterator();
        while (it1.hasNext()){
            int next = it1.next().getTemperatura();
            if (media > next) it1.remove();
        }
        System.out.println("\nTemperaturas acima da média: ");
        for (Temperatura temp: temperaturas) System.out.println("\nTemperatura: "+temp.getTemperatura()+"\nMes: "+temp.getMes());
    }
}

class Temperatura{
    int temperatura;
    String mes;

    public Temperatura(int temperatura, String mes) {
        this.temperatura = temperatura;
        this.mes = mes;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public String getMes() {
        return mes;
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "temperatura=" + temperatura +
                ", mes='" + mes + '\'' +
                '}';
    }
}