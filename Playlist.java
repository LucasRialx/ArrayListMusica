import java.util.ArrayList;

public class Playlist {
    private ArrayList<Musica> listaMusicas;

    // Construtor
    public Playlist() {
        listaMusicas = new ArrayList<>();
    }

    // Adiciona uma música à playlist
    public void adicionarMusica(Musica musica) {
        listaMusicas.add(musica);
    }

    // Remove uma música pelo título
    public boolean removerMusica(String titulo) {
        for (Musica musica : listaMusicas) {
            if (musica.getTitulo().equalsIgnoreCase(titulo)) {
                listaMusicas.remove(musica);
                return true;
            }
        }
        return false; // Retorna false se não encontrar a música
    }

    // Lista todas as músicas da playlist
    public void listarMusicas() {
        if (listaMusicas.isEmpty()) {
            System.out.println("A playlist está vazia.");
        } else {
            for (Musica musica : listaMusicas) {
                System.out.println(musica);
            }
        }
    }

    // Exibe a duração total da playlist
    public double duracaoTotal() {
        double total = 0;
        for (Musica musica : listaMusicas) {
            total += musica.getDuracao();
        }
        return total;
    }
}
