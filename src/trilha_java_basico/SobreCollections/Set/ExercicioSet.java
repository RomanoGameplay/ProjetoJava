package trilha_java_basico.SobreCollections.Set;

import java.util.*;

public class ExercicioSet {
    public static void main(String[] args) {
        Set<Cor> coresArcoIris = new HashSet<>(){{
            add(new Cor("amarelo"));
            add(new Cor("azul"));
            add(new Cor("vermelho"));
            add(new Cor("roxo"));
            add(new Cor("verde"));
            add(new Cor("laranja"));
            add(new Cor("violeta"));
        }};
        for (Cor cor: coresArcoIris) System.out.println(cor.getNome());
        System.out.println(coresArcoIris.size());

        Set<Cor> coresTreeSet = new TreeSet<>(new ComparatorCor());
        coresTreeSet.addAll(coresArcoIris);
        for (Cor cor: coresTreeSet) System.out.println(cor.getNome());

        List<Cor> cores = new ArrayList<>(){{
            add(new Cor("amarelo"));
            add(new Cor("azul"));
            add(new Cor("vermelho"));
            add(new Cor("roxo"));
            add(new Cor("verde"));
            add(new Cor("laranja"));
            add(new Cor("violeta"));
        }};

        Collections.reverse(cores);
        System.out.println("\nOrdem Inversa: "+cores);

        System.out.println("\nCores que começam com 'v': ");
        Iterator<Cor> it = coresTreeSet.iterator();
        while (it.hasNext()){
            String next = it.next().getNome();
            if (!(next.startsWith("v"))) it.remove();
        }
        System.out.println(coresTreeSet);
        coresTreeSet.clear();
        System.out.println("\n"+coresTreeSet.isEmpty());
    }
}

class Cor{
    String nome;

    public Cor(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "Cor{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
class ComparatorCor implements Comparator<Cor>{

    @Override
    public int compare(Cor o1, Cor o2) {
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        return nome;
    }
}
