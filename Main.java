import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    limparTela();
    Scanner scanner = new Scanner(System.in);
    Biblioteca biblioteca = new Biblioteca();

    int opcao = 1;

    while (opcao != 0) {
      menu();
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          biblioteca.exibirAcervo();
          break;
        case 2:
          biblioteca.adicionarLivro(biblioteca.disponiveisParaAdicionar());
          break;
        case 3:
          biblioteca.buscarLivro();
          break;
        case 4:
          biblioteca.atualizarLivro();
          break;
        case 5:
          biblioteca.removerLivro();
          break;
        case 6:
          biblioteca.emprestarLivro();
          break;
        case 7:
          biblioteca.devolverLivro();
          break;
        case 0:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida.");
          break;
      }
    }
    scanner.close();
  }

  public static void limparTela() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void menu() {
    System.out.println("=====================================");
    System.out.println("Escollha uma opção:");
    System.out.println("");
    System.out.println("1 - Mostrar acervo");
    System.out.println("2 - Adicionar livro");
    System.out.println("3 - Buscar livro");
    System.out.println("4 - Atualizar livro");
    System.out.println("5 - Remover livro");
    System.out.println("6 - Emprestar livro");
    System.out.println("7 - Devolver livro");
    System.out.println("0 - Sair");
    System.out.println("=====================================");
  }

}