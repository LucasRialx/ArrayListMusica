import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist playlist = new Playlist();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar música");
            System.out.println("2. Remover música");
            System.out.println("3. Listar músicas");
            System.out.println("4. Exibir duração total da playlist");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título da música: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o nome do artista: ");
                    String artista = scanner.nextLine();
                    System.out.print("Digite a duração da música (em minutos): ");
                    double duracao = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha

                    Musica musica = new Musica(titulo, artista, duracao);
                    playlist.adicionarMusica(musica);
                    System.out.println("Música adicionada à playlist!");
                    break;

                case 2:
                    System.out.print("Digite o título da música que deseja remover: ");
                    String tituloRemover = scanner.nextLine();
                    boolean removido = playlist.removerMusica(tituloRemover);
                    if (removido) {
                        System.out.println("Música removida da playlist!");
                    } else {
                        System.out.println("Música não encontrada.");
                    }
                    break;

                case 3:
                    System.out.println("Músicas na playlist:");
                    playlist.listarMusicas();
                    break;

                case 4:
                    System.out.println("Duração total da playlist: " + playlist.duracaoTotal() + " minutos");
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return; // Encerra o programa

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
