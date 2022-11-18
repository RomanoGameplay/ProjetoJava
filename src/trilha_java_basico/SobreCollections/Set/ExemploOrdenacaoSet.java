package trilha_java_basico.SobreCollections.Set;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        Set<Serie> minhasseries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 50));
            add(new Serie("that's 70 show", "comedia", 45));
        }};

        for (Serie serie:
             minhasseries) {
            System.out.println(serie.getNome()+" - "+ serie.getGenero()+" - "+serie.getTempoEpisodio());
        }
        System.out.println();
        Set<Serie> minhasseries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 50));
            add(new Serie("that's 70 show", "comedia", 45));
        }};
        for (Serie serie:
             minhasseries1) {
            System.out.println(serie.getNome()+" - "+ serie.getGenero()+" - "+serie.getTempoEpisodio());
        }
        System.out.println();
        Set<Serie> minhasseries2 = new TreeSet<>(minhasseries1);
        for (Serie serie:
                minhasseries2) {
            System.out.println(serie.getNome()+" - "+ serie.getGenero()+" - "+serie.getTempoEpisodio());
        }
        Set<Serie> minhasseries3 = new TreeSet<>(new CompartorNomeGeneroTempoEpisodio());
        minhasseries3.addAll(minhasseries);
        System.out.println("\nNome Tempo e Genero");
        for (Serie serie:
                minhasseries3) {
            System.out.println(serie.getNome()+" - "+ serie.getGenero()+" - "+serie.getTempoEpisodio());
        }
    }
}

class CompartorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie o1, Serie o2) {
        int tempoEpisodio = Integer.compare(o1.getTempoEpisodio(), o2.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;
        int genero = o1.getGenero().compareToIgnoreCase(o2.getGenero());
        if (genero != 0) return genero;
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if (nome != 0) return nome;
        return Integer.compare(o1.getTempoEpisodio(), o2.getTempoEpisodio());
    }
}

class Serie implements Comparable<Serie>{
    public Serie(String nome, String genero, int tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    private String nome;
    private String genero;
    private int tempoEpisodio;

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return getTempoEpisodio() == serie.getTempoEpisodio() && getNome().equals(serie.getNome()) && getGenero().equals(serie.getGenero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getGenero(), getTempoEpisodio());
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public int compareTo(Serie o) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), o.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareToIgnoreCase(o.getGenero());
    }
}


