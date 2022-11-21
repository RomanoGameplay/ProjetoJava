package trilha_java_basico.SobreCollections.Map;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        Map<String, Livro> livros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};

        for (Map.Entry<String, Livro> livro:
             livros.entrySet()) {
            System.out.println(livro.getKey() + " - "+ livro.getValue().getNome());
        }
        System.out.println("\n");
        Map<String, Livro> livros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro:
                livros1.entrySet()) {
            System.out.println(livro.getKey() + " - "+ livro.getValue().getNome());
        }
        System.out.println("\n");
        Map<String, Livro> livros2 = new TreeMap<>(livros1);
        for (Map.Entry<String, Livro> livro:
                livros2.entrySet()) {
            System.out.println(livro.getKey() + " - "+ livro.getValue().getNome());
        }

        Set<Map.Entry<String, Livro>> livros3 = new TreeSet<>(new ComparatorNome());
        livros3.addAll(livros.entrySet());
        System.out.println("\n");
        for (Map.Entry<String, Livro> livro:
                livros3) {
            System.out.println(livro.getKey() + " - "+ livro.getValue().getNome());
        }
    }
}

class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return getNome().equals(livro.getNome()) && getPaginas().equals(livro.getPaginas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getPaginas());
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }
}
