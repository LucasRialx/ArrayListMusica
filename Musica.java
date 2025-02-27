public class Musica {
    private final String titulo;
    private final String artista;
    private final double duracao;
// final é uma palavra reservada que indica que a variável não pode ser alterada posteriormente.
    
    // Construtor
    public Musica(String titulo, String artista, double duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    // Método para exibir as informações da música
    @Override
    public String toString() {
        return "Título: " + titulo + ", Artista: " + artista + ", Duração: " + duracao + " min";
    }
}
// O overriding é um mecanismo que permite que você sobrescreva um método existente na superclasse.
