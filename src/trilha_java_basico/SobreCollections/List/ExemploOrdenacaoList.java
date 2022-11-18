package trilha_java_basico.SobreCollections.List;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusgatos = new ArrayList<>(){{
            add(new Gato("Jon", 18,"preto"));
            add(new Gato("Simba", 14, "laranja"));
            add(new Gato("Garfield", 12, "alaranjado"));
        }};

        System.out.println(meusgatos);

        Collections.shuffle(meusgatos);
        System.out.println(meusgatos);

        Collections.sort(meusgatos);
        System.out.println(meusgatos);
//        Collections.sort(meusgatos, new ComparatorIdade());
        meusgatos.sort(new ComparatorIdade());
        System.out.println(meusgatos);
        meusgatos.sort(new ComparatorCor());
        System.out.println(meusgatos);
        meusgatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusgatos);
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato o1, Gato o2) {
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if(nome!=0) return nome;
        int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
        if (cor!=0) return cor;
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}

class Gato implements Comparable<Gato>{
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato o1, Gato o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato o1, Gato o2) {
        return o1.getCor().compareToIgnoreCase(o2.getCor());
    }
}
