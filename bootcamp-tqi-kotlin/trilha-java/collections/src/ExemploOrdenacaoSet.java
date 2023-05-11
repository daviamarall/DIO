import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {

        // Crie um conjunto e ordene este conjunto exibindo: (nome - gênero - tempo do episódio):
        // série 1: got, fantasia, 60
        // série 2: dark, drama, 60
        // série 3: that '70s show, comédia, 25

        Serie[] minhasSeries = {
            new Serie("got", "fantasia", 60),
            new Serie("dark", "drama", 60),
            new Serie("that '70s show", "comédia", 25)
        };

        // Use um Comparator para ordenar as séries pelo nome
        Set<Serie> seriesPorNome = new TreeSet<>(Comparator.comparing(Serie::getNome));
        seriesPorNome.add(minhasSeries[0]);
        seriesPorNome.add(minhasSeries[1]);
        seriesPorNome.add(minhasSeries[2]);
        System.out.println("Ordem por nome: " + seriesPorNome);

        // Use um Comparator para ordenar as séries pelo gênero
        Set<Serie> seriesPorGenero = new TreeSet<>(Comparator.comparing(Serie::getGenero));
        seriesPorGenero.add(minhasSeries[0]);
        seriesPorGenero.add(minhasSeries[1]);
        seriesPorGenero.add(minhasSeries[2]);
        System.out.println("Ordem por gênero: " + seriesPorGenero);

        // Use um Comparator para ordenar as séries pelo tempo do episódio
        Set<Serie> seriesPorTempo = new TreeSet<>(Comparator.comparingInt(Serie::getTempoEpisodio));
        seriesPorTempo.add(minhasSeries[0]);
        seriesPorTempo.add(minhasSeries[1]);
        seriesPorTempo.add(minhasSeries[2]);
        System.out.println("Ordem por tempo do episódio: " + seriesPorTempo);


    }

}
