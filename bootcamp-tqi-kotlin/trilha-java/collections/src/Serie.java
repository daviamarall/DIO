public class Serie {

    private String nome;
    private String genero;
    private int tempoEpisodio;

    public Serie(String nome, String genero, int tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

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
    public String toString() {
        return nome + " - " + genero + " - " + tempoEpisodio;
    }


}
