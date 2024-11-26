import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

  private List<Livro> acervo;
  private List<Livro> disponiveisToAdd;

  public Biblioteca() {

    this.acervo = new ArrayList<>();
    this.disponiveisToAdd = new ArrayList<>();

    Livro livro1 = new Livro("Java: Como Programar", "Deitel & Deitel", "Pearson", 2020, "978-8576059029", 5);
    Livro livro2 = new Livro("Clean Code", "Robert C. Martin", "Prentice Hall", 2008, "978-0132350884", 3);
    Livro livro3 = new Livro("Python para Desenvolvedores", "Luiz Eduardo Borges", "Novatec", 2014, "978-8575223933",
        4);
    Livro livro4 = new Livro("Estruturas de Dados e Algoritmos em Java", "Robert Lafore", "Pearson", 2003,
        "978-8576051239", 6);
    Livro livro5 = new Livro("The Pragmatic Programmer", "Andrew Hunt e David Thomas", "Addison-Wesley", 1999,
        "978-0201616224", 2);
    Livro livro6 = new Livro("Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides",
        "Addison-Wesley", 1994, "978-0201633610", 3);
    Livro livro7 = new Livro("Introdução à Programação com Python", "Nilo Ney Coutinho Menezes", "Novatec", 2020,
        "978-6586057195", 5);
    Livro livro8 = new Livro("Code Complete", "Steve McConnell", "Microsoft Press", 2004, "978-0735619678", 7);
    Livro livro9 = new Livro("JavaScript: The Good Parts", "Douglas Crockford", "O'Reilly Media", 2008,
        "978-0596517748", 2);
    Livro livro10 = new Livro("Refactoring", "Martin Fowler", "Addison-Wesley", 1999, "978-0201485677", 4);
    Livro livro11 = new Livro("Artificial Intelligence: A Modern Approach", "Stuart Russell e Peter Norvig", "Pearson",
        2020, "978-0134610993", 3);
    Livro livro12 = new Livro("Introduction to the Theory of Computation", "Michael Sipser", "Cengage Learning", 2012,
        "978-1133187790", 2);

    acervo.add(livro1);
    acervo.add(livro2);
    acervo.add(livro3);
    acervo.add(livro4);
    acervo.add(livro5);
    acervo.add(livro6);
    acervo.add(livro7);
    acervo.add(livro8);
    acervo.add(livro9);
    disponiveisToAdd.add(livro10);
    disponiveisToAdd.add(livro11);
    disponiveisToAdd.add(livro12);

  }

  public Livro disponiveisParaAdicionar() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Livros disponíveis para adicionar:");
    System.out.println();
    int i = 0;
    for (Livro livro : disponiveisToAdd) {
      System.out.printf("%d - %s\n", i, livro.getTitulo());
      i++;
    }

    System.out.println("Escolha o livro para adicionar:");
    i = scan.nextInt();

    limparTela();

    return disponiveisToAdd.get(i);
  }
  // Métodos para operações de livros (adicionar, buscar, atualizar, excluir)

  public void adicionarLivro(Livro livro) {
    for (Livro l : this.acervo) {
      if (l.getTitulo().equals(livro.getTitulo())) {
        System.out.println("Livro já cadastrado.");
        return;
      }
    }
    System.out.println("******************************************");
    System.out.println(
        "Livro adicionado =>" + livro.getTitulo());
    this.acervo.add(livro);
    System.out.println("******************************************");

  }

  public void buscarLivro() {
    Scanner scan = new Scanner(System.in);
    ArrayList<Livro> livrosEncontrados = new ArrayList<>();

    System.out.println("Digite o título do livro:");
    String titulo = scan.nextLine();

    for (Livro livro : this.acervo) {
      if (livro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
        livrosEncontrados.add(livro);
      }
    }
    limparTela();
    if (livrosEncontrados.size() > 0) {
      System.out.println("******************************************");
      System.out.println("\nLivros encontrados: ");
      for (Livro livro : livrosEncontrados) {
        System.out.printf("Título => %s - %s\n", livro.getTitulo(), livro.getAutor());
      }
      System.out.println("******************************************");
      return;
    }
    limparTela();
    System.out.println("Livro não encontrado.");
  }

  public void atualizarLivro() {
    Scanner scan = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    int i = 0;

    for (Livro livro : this.acervo) {
      System.out.printf("%d => Título: %s\n", i, livro.getTitulo());
      i++;
    }
    System.out.println("\nEscolha o livro que deseja atualizar: ");
    int titulo = scan.nextInt();

    limparTela();
    for (Livro livro : this.acervo) {
      if (livro.getTitulo().equals(acervo.get(titulo).getTitulo())) {
        System.out.println("Digite o novo título do livro: ");
        String novoTitulo = scan2.nextLine();
        limparTela();

        livro.setTitulo(novoTitulo);
        System.out.println("******************************************\n");

        System.out.println("Livro atualizado.");
        System.out.println("******************************************\n");

        return;
      }
    }
    limparTela();
    System.out.println("******************************************\n");
    System.out.println("Livro não encontrado.");
    System.out.println("******************************************\n");

  }

  public void removerLivro() {
    Scanner scan = new Scanner(System.in);

    int i = 0;

    for (Livro livro : this.acervo) {
      System.out.printf("%d => Título: %s\n", i, livro.getTitulo());
      i++;
    }
    System.out.println("\nEscolha o livro que deseja remover: ");
    int titulo = scan.nextInt();

    for (Livro livro : this.acervo) {
      if (livro.getTitulo().equals(acervo.get(titulo).getTitulo())) {
        this.acervo.remove(livro);
        limparTela();
        System.out.println("******************************************\n");

        System.out.println("Livro removido.");
        System.out.println("******************************************\n");

        return;
      }
    }
    limparTela();
    System.out.println("******************************************\n");

    System.out.println("Livro não encontrado.");
    System.out.println("******************************************\n");

  }

  // Métodos para empréstimo e devolução

  public void emprestarLivro() {
    Scanner scan = new Scanner(System.in);
    int i = 0;

    for (Livro livro : this.acervo) {
      System.out.printf("%d => Título: %s\n", i, livro.getTitulo());
      i++;
    }
    System.out.println("\nEscolha o livro que deseja emprestar: ");
    int titulo = scan.nextInt();

    for (Livro livro : this.acervo) {
      if (livro.getTitulo().equals(acervo.get(titulo).getTitulo())) {
        if (livro.getQuantidadeDisponivel() > 0) {
          livro.setQuantidadeDisponivel(livro.getQuantidadeDisponivel() - 1);
          limparTela();
          System.out.println("******************************************\n");

          System.out.printf("Livro emprestado:%s => %s", livro.getTitulo(),
              livro.getQuantidadeDisponivel() + " livros disponíveis.\n");
          System.out.println("******************************************\n");

          return;
        } else {
          limparTela();

          System.out.println("******************************************\n");

          System.out.println("Livro não disponível.");
          System.out.println("******************************************\n");

          return;
        }
      }
    }
    limparTela();
    System.out.println("******************************************\n");

    System.out.println("Livro não encontrado.");

    System.out.println("******************************************\n");
  }

  public void devolverLivro() {
    Scanner scan = new Scanner(System.in);
    int i = 0;

    for (Livro livro : this.acervo) {
      System.out.printf("%d => Título: %s\n", i, livro.getTitulo());
      i++;
    }
    System.out.println("\nEscolha o livro que deseja devolver: ");
    int titulo = scan.nextInt();

    for (Livro livro : this.acervo) {
      if (livro.getTitulo().equals(acervo.get(titulo).getTitulo())) {
        livro.setQuantidadeDisponivel(livro.getQuantidadeDisponivel() + 1);
        limparTela();
        System.out.println("******************************************\n");

        System.out.println("Livro devolvido.");
        System.out.println("******************************************\n");

        return;
      }
    }
    System.out.println("******************************************\n");

    System.out.println("Livro não encontrado.");
    System.out.println("******************************************\n");

  }

  public void exibirAcervo() {
    limparTela();
    int i = 0;
    System.out.println("******************************************\n");
    for (Livro livro : this.acervo) {
      System.out.println("Título: " + livro.getTitulo());
      System.out.println("Autor: " + livro.getAutor());
      System.out.println("Editora: " + livro.getEditora());
      System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
      System.out.println("ISBN: " + livro.getISBN());
      System.out.println("Quantidade Disponível: " + livro.getQuantidadeDisponivel());
      System.out.println();
      i++;
    }
    System.out.println("Livros disponíveis: " + i);
    System.out.println("******************************************\n");

  }

  public static void limparTela() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

}